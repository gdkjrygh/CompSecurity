// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.wear;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.Time;
import android.util.Log;
import com.gau.go.launcherex.gowidget.framework.GoWidgetActivity;
import com.gau.go.launcherex.gowidget.weather.model.ForecastBean;
import com.gau.go.launcherex.gowidget.weather.model.GoLifeBean;
import com.gau.go.launcherex.gowidget.weather.model.HourlyBean;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.j;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.go.weatherex.wear.a.a.a;
import com.go.weatherex.wear.a.a.b;
import com.go.weatherex.wear.a.a.c;
import com.go.weatherex.wear.a.a.d;
import com.go.weatherex.wear.a.a.e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataEventBuffer;
import com.google.android.gms.wearable.DataMap;
import com.google.android.gms.wearable.MessageEvent;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.PutDataMapRequest;
import com.google.android.gms.wearable.Wearable;
import com.google.android.gms.wearable.WearableListenerService;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.go.weatherex.wear:
//            f, c, a, b

public class WearService extends WearableListenerService
    implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
{

    private GoogleApiClient a;
    private u b;
    private ArrayList c;

    public WearService()
    {
        b = null;
        c = new ArrayList();
    }

    private ArrayList a(ArrayList arraylist)
    {
        Time time = new Time();
        time.setToNow();
        int k = arraylist.size();
        int i = 0;
        do
        {
            if (i >= arraylist.size())
            {
                break MISSING_BLOCK_LABEL_151;
            }
            HourlyBean hourlybean = (HourlyBean)arraylist.get(i);
            if (hourlybean.d() == time.hour && hourlybean.c() == time.monthDay)
            {
                for (; i != 0; i = k)
                {
                    Log.i("JKL", (new StringBuilder()).append("getValidHourlyBeans : != 0 : ").append(i).toString());
                    ArrayList arraylist1 = new ArrayList();
                    for (; i < arraylist.size(); i++)
                    {
                        arraylist1.add(arraylist.get(i));
                    }

                    return arraylist1;
                }

                Log.i("JKL", "getValidHourlyBeans : == 0");
                return arraylist;
            }
            i++;
        } while (true);
    }

    private void a()
    {
        com.go.weatherex.wear.f.a("WearService - sendTodayWeatherCard");
        PutDataMapRequest putdatamaprequest = PutDataMapRequest.create("/data/weather/today");
        WeatherBean weatherbean = c();
        if (weatherbean == null)
        {
            com.go.weatherex.wear.f.a("WearService - Today : null");
        } else
        if (System.currentTimeMillis() - weatherbean.l.f() <= 0x6ddd00L)
        {
            a(weatherbean, putdatamaprequest);
            b(weatherbean, putdatamaprequest);
            c(weatherbean, putdatamaprequest);
            e(weatherbean, putdatamaprequest);
            a(putdatamaprequest);
            Wearable.DataApi.putDataItem(a, putdatamaprequest.asPutDataRequest());
            com.go.weatherex.wear.f.a("WearService - Today : send");
            com.go.weatherex.wear.c.a(this).b();
            return;
        }
    }

    private void a(WeatherBean weatherbean, PutDataMapRequest putdatamaprequest)
    {
        weatherbean = com.go.weatherex.wear.a.a(weatherbean);
        DataMap datamap = new DataMap();
        weatherbean.a(datamap);
        putdatamaprequest.getDataMap().putDataMap("/bean/wear/city", datamap);
    }

    private void a(PutDataMapRequest putdatamaprequest)
    {
        putdatamaprequest.getDataMap().putString("/string/goweatherex", getString(0x7f08002c));
        putdatamaprequest.getDataMap().putString("/string/today", getString(0x7f080510));
        putdatamaprequest.getDataMap().putString("string/future", getString(0x7f080511));
        putdatamaprequest.getDataMap().putString("string/precipitation", getString(0x7f0802b0));
        putdatamaprequest.getDataMap().putString("string/tomorrow", getString(0x7f080512));
    }

    private void a(String s)
    {
        if (s.equals("/data/weather/today"))
        {
            a();
        } else
        if (s.equals("/data/weather/tomorrow"))
        {
            b();
            return;
        }
    }

    private int b(ArrayList arraylist)
    {
        if (arraylist.size() >= 13)
        {
            return 4;
        }
        if (arraylist.size() >= 4)
        {
            return arraylist.size() / 4;
        }
        return arraylist.size() <= 0 ? -1 : 0;
    }

    private void b()
    {
        com.go.weatherex.wear.f.a("WearService - sendTomorrowWeatherCard");
        PutDataMapRequest putdatamaprequest = PutDataMapRequest.create("/data/weather/tomorrow");
        WeatherBean weatherbean = c();
        if (weatherbean == null)
        {
            com.go.weatherex.wear.f.a("WearService - Tomorrow : null");
        } else
        {
            a(weatherbean, putdatamaprequest);
            if (d(weatherbean, putdatamaprequest))
            {
                a(putdatamaprequest);
                Wearable.DataApi.putDataItem(a, putdatamaprequest.asPutDataRequest());
                com.go.weatherex.wear.f.a("WearService - Tomorrow : send");
                com.go.weatherex.wear.c.a(this).c();
                return;
            }
        }
    }

    private void b(WeatherBean weatherbean, PutDataMapRequest putdatamaprequest)
    {
        weatherbean = com.go.weatherex.wear.a.a(b, weatherbean.l);
        DataMap datamap = new DataMap();
        weatherbean.a(datamap);
        putdatamaprequest.getDataMap().putDataMap("/bean/wear/now", datamap);
    }

    private WeatherBean c()
    {
        return f.a(this).a(com.go.weatherex.wear.b.a(this).a());
    }

    private ArrayList c(ArrayList arraylist)
    {
        Object obj;
        int i;
        int k;
        obj = new Time();
        ((Time) (obj)).setToNow();
        k = arraylist.size();
        i = 0;
_L4:
label0:
        {
            if (i >= arraylist.size())
            {
                break MISSING_BLOCK_LABEL_119;
            }
            ForecastBean forecastbean = (ForecastBean)arraylist.get(i);
            if (forecastbean.f() == ((Time) (obj)).month + 1 && forecastbean.g() == ((Time) (obj)).monthDay)
            {
                break label0;
            } else
            {
                i++;
                continue; /* Loop/switch isn't completed */
            }
        }
_L2:
        obj = arraylist;
        if (i != 0)
        {
            obj = new ArrayList();
            for (; i < arraylist.size(); i++)
            {
                ((ArrayList) (obj)).add(arraylist.get(i));
            }

        }
        return ((ArrayList) (obj));
        i = k;
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void c(WeatherBean weatherbean, PutDataMapRequest putdatamaprequest)
    {
        ArrayList arraylist = a(weatherbean.h);
        ArrayList arraylist1 = new ArrayList();
        int i1 = b(arraylist);
        if (i1 >= 0)
        {
            int i;
            int k;
            if (i1 == 0)
            {
                k = arraylist.size();
            } else
            {
                k = 3;
            }
            i = 0;
            while (i < k) 
            {
                Object obj;
                DataMap datamap;
                int l;
                if (i1 == 0)
                {
                    l = i;
                } else
                {
                    l = (i + 1) * i1;
                }
                obj = (HourlyBean)arraylist.get(l);
                obj = com.go.weatherex.wear.a.a(b, weatherbean.l, ((HourlyBean) (obj)));
                datamap = new DataMap();
                ((c) (obj)).a(datamap);
                arraylist1.add(datamap);
                i++;
            }
        }
        putdatamaprequest.getDataMap().putDataMapArrayList("/bean/wear/hourly", arraylist1);
    }

    private boolean d(WeatherBean weatherbean, PutDataMapRequest putdatamaprequest)
    {
        weatherbean = c(weatherbean.g);
        ArrayList arraylist = new ArrayList();
        int i;
        if (weatherbean.size() > 3)
        {
            i = 3;
        } else
        {
            i = weatherbean.size();
        }
        if (i != 0)
        {
            for (int k = 0; k < i; k++)
            {
                Object obj = (ForecastBean)weatherbean.get(k);
                obj = com.go.weatherex.wear.a.a(b, ((ForecastBean) (obj)));
                DataMap datamap = new DataMap();
                ((b) (obj)).a(datamap);
                arraylist.add(datamap);
            }

        }
        putdatamaprequest.getDataMap().putDataMapArrayList("/bean/wear/forecast", arraylist);
        return i > 1;
    }

    private void e(WeatherBean weatherbean, PutDataMapRequest putdatamaprequest)
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = com.go.weatherex.home.c.e.a(weatherbean.k, 1);
        Object obj = com.go.weatherex.home.c.e.a(weatherbean.k, 2);
        weatherbean = com.go.weatherex.home.c.e.a(weatherbean.k, 3);
        if (!((ArrayList) (obj)).isEmpty())
        {
            obj = com.go.weatherex.wear.a.a(this, (GoLifeBean)((ArrayList) (obj)).get(0));
            if (((d) (obj)).a().equals(j.e.a()))
            {
                DataMap datamap2 = new DataMap();
                ((d) (obj)).a(datamap2);
                arraylist.add(datamap2);
            }
        }
        if (!weatherbean.isEmpty())
        {
            weatherbean = com.go.weatherex.wear.a.a(this, (GoLifeBean)weatherbean.get(0));
            if (weatherbean.a().equals(j.b.a()))
            {
                DataMap datamap1 = new DataMap();
                weatherbean.a(datamap1);
                arraylist.add(datamap1);
            }
        }
        if (!arraylist1.isEmpty())
        {
            weatherbean = com.go.weatherex.wear.a.a(this, (GoLifeBean)arraylist1.get(0));
            if (weatherbean.a().equals(j.c.a()))
            {
                DataMap datamap = new DataMap();
                weatherbean.a(datamap);
                arraylist.add(datamap);
            }
        }
        putdatamaprequest.getDataMap().putDataMapArrayList("/bean/wear/life", arraylist);
    }

    public void onConnected(Bundle bundle)
    {
        com.go.weatherex.wear.f.a("WearService - onConnected");
        String s;
        for (bundle = c.iterator(); bundle.hasNext(); a(s))
        {
            s = (String)bundle.next();
            com.go.weatherex.wear.f.a((new StringBuilder()).append("WearService - onConnected : send ").append(s).toString());
        }

        c.clear();
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
    }

    public void onConnectionSuspended(int i)
    {
    }

    public void onCreate()
    {
        super.onCreate();
        b = com.gau.go.launcherex.gowidget.weather.c.c.a(getApplicationContext()).f().a();
        a = (new com.google.android.gms.common.api.GoogleApiClient.Builder(this)).addApi(Wearable.API).addConnectionCallbacks(this).addOnConnectionFailedListener(this).build();
        a.connect();
    }

    public void onDataChanged(DataEventBuffer dataeventbuffer)
    {
        super.onDataChanged(dataeventbuffer);
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (a != null && a.isConnected())
        {
            a.disconnect();
        }
    }

    public void onMessageReceived(MessageEvent messageevent)
    {
        super.onMessageReceived(messageevent);
        if (messageevent.getPath().equals("/activity/phone"))
        {
            messageevent = new Intent(this, com/gau/go/launcherex/gowidget/framework/GoWidgetActivity);
            messageevent.setFlags(0x10000000);
            startActivity(messageevent);
        }
    }

    public void onPeerConnected(Node node)
    {
        super.onPeerConnected(node);
        com.go.weatherex.wear.f.a("--------------------------------------------------------------------");
        com.go.weatherex.wear.f.a("\u8FDE\u63A5\u4E0A\u624B\u8868\uFF0C\u8FDB\u5165\u53D1\u9001\u5361\u7247\u903B\u8F91");
        com.go.weatherex.wear.c.a(this).a();
    }

    public void onPeerDisconnected(Node node)
    {
        super.onPeerDisconnected(node);
    }

    public int onStartCommand(Intent intent, int i, int k)
    {
        if (intent != null)
        {
            com.go.weatherex.wear.f.a("WearService - onStartCommand");
            String s = intent.getStringExtra("notification_type_key");
            if (!TextUtils.isEmpty(s))
            {
                com.go.weatherex.wear.f.a((new StringBuilder()).append("WearService - onStartCommand : type : ").append(s).toString());
                if (a.isConnected())
                {
                    com.go.weatherex.wear.f.a("WearService - onStartCommand : connected, sending");
                    a(s);
                } else
                {
                    com.go.weatherex.wear.f.a("WearService - onStartCommand : not connected, wait for connectd");
                    c.add(s);
                }
            }
        }
        return super.onStartCommand(intent, i, k);
    }
}
