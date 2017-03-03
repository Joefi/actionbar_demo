package com.example.actionbardemo;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class BlueFragment extends Fragment {
	/*
	 * 创建一个布局并返回
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		LinearLayout colorLayout = new LinearLayout(getActivity());
		//布局参数：长宽
		LinearLayout.LayoutParams ll = new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);
		//布局参数：背景颜色
		colorLayout.setBackgroundColor(Color.BLUE);
		//设置参数
		colorLayout.setLayoutParams(ll);
		return colorLayout;
	}
}
