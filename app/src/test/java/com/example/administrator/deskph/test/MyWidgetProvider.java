package com.example.administrator.deskph.test;


import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;

import java.util.Timer;

/**
 * Created by Administrator on 2016/12/19.
 */

public class MyWidgetProvider extends AppWidgetProvider
{
    private static Timer myTimer;
    private static int index = 0;

    private final String broadCastString = "knowheart.wd.appWidgetUpdate";

    @Override
    public void onDeleted(Context context, int[] appWidgetIds)
    {
        // TODO Auto-generated method stub
        super.onDeleted(context, appWidgetIds);

    }



    @Override
    public void onEnabled(Context context)
    {
        // TODO Auto-generated method stub
        super.onEnabled(context);

    }



    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager,
                         int[] appWidgetIds)
    {
        // TODO Auto-generated method stub
        super.onUpdate(context, appWidgetManager, appWidgetIds);
    }



    @Override
    public void onReceive(Context context, Intent intent)
    {
        super.onReceive(context, intent);
    }

}