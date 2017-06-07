package com.why.project.toastutildemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.why.project.toastutildemo.MyApplication;
import com.why.project.toastutildemo.R;
import com.why.project.toastutildemo.util.ToastUtil;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ToastUtil.showShortToast("ToastUtilDemo");
		ToastUtil.showShortToast(MyApplication.getAppContext().getResources().getString(R.string.app_name));
	}
}
