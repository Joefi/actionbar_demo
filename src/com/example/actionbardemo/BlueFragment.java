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
	 * ����һ�����ֲ�����
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		LinearLayout colorLayout = new LinearLayout(getActivity());
		//���ֲ���������
		LinearLayout.LayoutParams ll = new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);
		//���ֲ�����������ɫ
		colorLayout.setBackgroundColor(Color.BLUE);
		//���ò���
		colorLayout.setLayoutParams(ll);
		return colorLayout;
	}
}
