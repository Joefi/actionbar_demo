package com.example.actionbardemo;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

public class MainActivity extends Activity implements TabListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
        //使用getActionBar()获取ActionBar，也可以使用getSupportActionBar()获取
        ActionBar actionBar = getActionBar();
        //设置ActionBar的导航模式，主要有三种模式:List，Standar，Tabs
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        //设置显示ActionBar上的标题，只得是android:label的文字
       // actionBar.setDisplayShowTitleEnabled(true);
        
        //添加Tab
        Tab tab = actionBar.newTab().setText("第一项").setTabListener(this);
        actionBar.addTab(tab);
        tab = actionBar.newTab().setText("第二项").setTabListener(this);
        actionBar.addTab(tab);
        tab = actionBar.newTab().setText("第三项").setTabListener(this);
        actionBar.addTab(tab);
    }

    
    //Tab被选中后再次选中时的操作，通常不进行任何操作
	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}
	//Tab被选中时的操作
	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		switch(tab.getPosition())
		{
		case 0:
			BlackFragment bf = new BlackFragment();
			ft.add(android.R.id.content, bf);
			break;
		case 1:
			RedFragment rf = new RedFragment();
			ft.add(android.R.id.content, rf);
			break;
		case 2:
			BlueFragment bbf = new BlueFragment();
			ft.add(android.R.id.content, bbf);
			break;
		default:
			break;
		}
	}
	//Tab离开选中状态的操作
	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}
}
