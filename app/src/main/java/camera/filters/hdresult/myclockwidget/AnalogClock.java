package camera.filters.hdresult.myclockwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.RemoteViews;
import android.app.PendingIntent;
import android.app.Service;

import java.util.Random;

/**
 * Implementation of App Widget functionality.
 */
public class AnalogClock extends AppWidgetProvider{

    public void onReceive(Context context, Intent intent)
    {
        String act=intent.getAction();
        if(AppWidgetManager.ACTION_APPWIDGET_UPDATE.equals(act))
        {
            RemoteViews myView =new RemoteViews(context.getPackageName(), R.layout.widget);

            AppWidgetManager.getInstance(context).updateAppWidget(intent.getIntArrayExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS), myView);
        }
    }
}

