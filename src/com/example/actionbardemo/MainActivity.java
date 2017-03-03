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
        //ʹ��getActionBar()��ȡActionBar��Ҳ����ʹ��getSupportActionBar()��ȡ
        ActionBar actionBar = getActionBar();
        //����ActionBar�ĵ���ģʽ����Ҫ������ģʽ:List��Standar��Tabs
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        //������ʾActionBar�ϵı��⣬ֻ����android:label������
       // actionBar.setDisplayShowTitleEnabled(true);
        
        //���Tab
        Tab tab = actionBar.newTab().setText("��һ��").setTabListener(this);
        actionBar.addTab(tab);
        tab = actionBar.newTab().setText("�ڶ���").setTabListener(this);
        actionBar.addTab(tab);
        tab = actionBar.newTab().setText("������").setTabListener(this);
        actionBar.addTab(tab);
    }

    
    //Tab��ѡ�к��ٴ�ѡ��ʱ�Ĳ�����ͨ���������κβ���
	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}
	//Tab��ѡ��ʱ�Ĳ���
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
	//Tab�뿪ѡ��״̬�Ĳ���
	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}
}
