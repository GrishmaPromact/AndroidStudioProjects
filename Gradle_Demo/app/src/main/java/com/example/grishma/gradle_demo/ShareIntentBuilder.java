package com.example.grishma.gradle_demo;

import android.content.Context;
import android.content.Intent;

/**
 * Created by grishma on 14-07-2016.
 */
public class ShareIntentBuilder
{
    public static void startSendActivity(Context context, String title, String body) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TITLE, title);
        intent.putExtra(Intent.EXTRA_TEXT, body);
        intent.setType("text/plain");
        Intent chooserIntent = Intent.createChooser(intent, context.getResources().getText(R.string.hello_world));
        chooserIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(chooserIntent);
    }
}
