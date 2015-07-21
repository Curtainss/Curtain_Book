package com.android.curtain_book;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

/**
 * 支持格式:电子书阅读 epub txt mobi word pdf ...等 功能:背景 书签 翻页 字体大小 样式 颜色 页码 笔记 菜单 目录...等
 * 目的:看别人源码不爽 另留作纪念 扩展性:下拉 上拉
 * 
 * @author Curtain
 * 
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);

		// btn.setOnClickListener(new OnClickListener() {
		//
		// @Override
		// public void onClick(View v) {
		// // TODO Auto-generated method stub
		//
		// }
		// });

		AlertDialog.Builder alert = new AlertDialog.Builder(this);
		alert.setTitle("软件升级").setMessage("发现新版本,建议立即更新使用.")

		.setPositiveButton("更新", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				// 开启更新服务UpdateService
				// 这里为了把update更好模块化，可以传一些updateService依赖的值
				// 如布局ID，资源ID，动态获取的标题,这里以app_name为例

				Toast.makeText(MainActivity.this, "正在下载...", Toast.LENGTH_SHORT)
						.show();
				// 更新

			}
		}).setNegativeButton("取消", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});
		alert.create().show();
	}

	Button btn;

}
