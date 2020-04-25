package com.classicspin.plugin;

import com.unity3d.player.UnityPlayer;
import android.widget.Toast;

public class Plugin {
	// Показать сообщение
	static void show(final String message) {
		UnityPlayer.currentActivity.runOnUiThread(new Runnable() {
			@Override
			public void run() {
				Toast.makeText(UnityPlayer.currentActivity, message, Toast.LENGTH_SHORT).show();
			}
		});
	}	
}