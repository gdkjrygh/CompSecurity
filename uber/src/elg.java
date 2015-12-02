// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.feature.notification.NotificationBackgroundConnectionService;
import com.ubercab.client.feature.notification.model.NotificationData;
import com.ubercab.client.feature.notification.model.TripNotificationData;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.FareSplit;
import com.ubercab.rider.realtime.model.Trip;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

public final class elg extends eld
    implements gmk
{

    private final drc a;
    private final hkr b;
    private final hku c;
    private final ExecutorService d;
    private final gmg e;
    private final bjw f;
    private final eku g;
    private final dpg h;
    private final czf i;
    private final dal j;
    private final ServiceConnection k = new ServiceConnection() {

        final elg a;

        public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
        }

        public final void onServiceDisconnected(ComponentName componentname)
        {
        }

            
            {
                a = elg.this;
                super();
            }
    };
    private boolean l;
    private boolean m;
    private icl n;
    private volatile boolean o;
    private TripNotificationData p;

    public elg(drc drc1, cev cev, Context context, hkr hkr1, hku hku1, ExecutorService executorservice, gmg gmg1, 
            bjw bjw1, NotificationManager notificationmanager, eku eku1, dpg dpg1, czf czf1, dal dal1)
    {
        super(context, cev, notificationmanager);
        a = drc1;
        b = hkr1;
        c = hku1;
        d = executorservice;
        e = gmg1;
        f = bjw1;
        g = eku1;
        i = czf1;
        h = dpg1;
        j = dal1;
        gmg1.a(this);
    }

    private android.support.v4.app.NotificationCompat.InboxStyle a(android.support.v4.app.NotificationCompat.Builder builder, TripNotificationData tripnotificationdata, String s)
    {
        builder = (new android.support.v4.app.NotificationCompat.InboxStyle(builder)).setSummaryText(s);
        SpannableStringBuilder spannablestringbuilder;
        for (tripnotificationdata = tripnotificationdata.getFareSplitClients().iterator(); tripnotificationdata.hasNext(); builder.addLine(spannablestringbuilder))
        {
            s = (com.ubercab.client.feature.notification.model.TripNotificationData.FareSplitClient)tripnotificationdata.next();
            SpannableString spannablestring = new SpannableString(s.getName());
            spannablestring.setSpan(new StyleSpan(1), 0, spannablestring.length(), 33);
            spannablestringbuilder = new SpannableStringBuilder();
            spannablestringbuilder.append(spannablestring);
            spannablestringbuilder.append(" ");
            spannablestringbuilder.append(s.getDisplayStatus(e()));
        }

        return builder;
    }

    private String a(TripNotificationData tripnotificationdata, boolean flag)
    {
        Context context;
        ArrayList arraylist;
        String s;
        byte byte0;
        context = e();
        arraylist = new ArrayList();
        s = tripnotificationdata.getTripStatus();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 5: default 80
    //                   -2146525273: 154
    //                   -1325796731: 186
    //                   -734206867: 170
    //                   1065961768: 138
    //                   2130210069: 202;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        byte0;
        JVM INSTR tableswitch 0 4: default 116
    //                   0 218
    //                   1 255
    //                   2 255
    //                   3 330
    //                   4 364;
           goto _L7 _L8 _L9 _L9 _L10 _L11
_L7:
        return gjw.a(" \u2022 ").a(gki.a(arraylist, new gka() {

            final elg a;

            private static boolean a(String s1)
            {
                return !TextUtils.isEmpty(s1);
            }

            public final boolean apply(Object obj)
            {
                return a((String)obj);
            }

            
            {
                a = elg.this;
                super();
            }
        }));
_L5:
        if (s.equals("dispatching"))
        {
            byte0 = 0;
        }
          goto _L1
_L2:
        if (s.equals("accepted"))
        {
            byte0 = 1;
        }
          goto _L1
_L4:
        if (s.equals("arrived"))
        {
            byte0 = 2;
        }
          goto _L1
_L3:
        if (s.equals("on_trip"))
        {
            byte0 = 3;
        }
          goto _L1
_L6:
        if (s.equals("redispatching"))
        {
            byte0 = 4;
        }
          goto _L1
_L8:
        tripnotificationdata = tripnotificationdata.getPickupAddress();
        if (!TextUtils.isEmpty(tripnotificationdata))
        {
            arraylist.add(context.getString(0x7f0702e6, new Object[] {
                tripnotificationdata
            }));
        }
          goto _L7
_L9:
        if (tripnotificationdata.getSurgeMultiplier() > 1.0F)
        {
            arraylist.add(context.getString(0x7f0702f5, new Object[] {
                Float.valueOf(tripnotificationdata.getSurgeMultiplier())
            }));
        }
        if (!flag)
        {
            arraylist.add(tripnotificationdata.getVehicleDisplayName());
        }
        if (tripnotificationdata.getVehicleLicense() != null)
        {
            arraylist.add(tripnotificationdata.getVehicleLicense());
        }
          goto _L7
_L10:
        arraylist.add(tripnotificationdata.getDriverName());
        if (tripnotificationdata.getVehicleLicense() != null)
        {
            arraylist.add(tripnotificationdata.getVehicleLicense());
        }
          goto _L7
_L11:
        arraylist.add(context.getString(0x7f0702f2));
          goto _L7
    }

    private static void a(android.support.v4.app.NotificationCompat.Builder builder)
    {
        builder.setDefaults(-1);
        builder.setPriority(1);
    }

    private void a(android.support.v4.app.NotificationCompat.Builder builder, int i1)
    {
        android.app.PendingIntent pendingintent = c(i1, "com.ubercab.client.ACTION_TRIP_CANCEL");
        builder.addAction(0x7f020184, e().getString(0x7f07007b), pendingintent);
    }

    private void a(android.support.v4.app.NotificationCompat.Builder builder, TripNotificationData tripnotificationdata, int i1)
    {
        if (tripnotificationdata.isMaster())
        {
            if (!"on_trip".equals(tripnotificationdata.getTripStatus()) && !tripnotificationdata.hasDestination() && !j.T())
            {
                e(builder, i1);
                return;
            }
            tripnotificationdata = b.f();
            if (a.g())
            {
                d(builder, i1);
            } else
            if (e.b(dbf.j) || tripnotificationdata != null && tripnotificationdata.getCanShareETA())
            {
                c(builder, i1);
            }
            if (e.b(dbf.j) || tripnotificationdata != null && tripnotificationdata.getCanSplitFare())
            {
                b(builder, i1);
                return;
            }
        }
    }

    private void a(City city, String s, FareSplit faresplit, boolean flag, Trip trip)
    {
        boolean flag3 = false;
        TripNotificationData tripnotificationdata = p;
        if (tripnotificationdata != null && tripnotificationdata.getSource() != com.ubercab.client.feature.notification.model.NotificationData.Source.FAKE)
        {
            if (trip == null)
            {
                d(p);
                return;
            }
            boolean flag1;
            boolean flag2;
            if (trip.getEta() != tripnotificationdata.getTripEta())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (trip.getDestination() != null && !tripnotificationdata.hasDestination())
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if ("accepted".equals(tripnotificationdata.getTripStatus()) || "arrived".equals(tripnotificationdata.getTripStatus()))
            {
                flag3 = true;
            }
            if (flag3 && (flag1 || flag2))
            {
                city = TripNotificationData.fromUpdate(city, s, faresplit, flag, trip);
                city.setSurgeMultiplier(tripnotificationdata.getSurgeMultiplier());
                city.setDriverExtra(tripnotificationdata.getDriverExtra());
                d.execute(new Runnable(city) {

                    final TripNotificationData a;
                    final elg b;

                    public final void run()
                    {
                        b.a(a);
                    }

            
            {
                b = elg.this;
                a = tripnotificationdata;
                super();
            }
                });
                return;
            }
        }
    }

    static void a(elg elg1, City city, String s, FareSplit faresplit, boolean flag, Trip trip)
    {
        elg1.a(city, s, faresplit, flag, trip);
    }

    private boolean a(android.support.v4.app.NotificationCompat.Builder builder, TripNotificationData tripnotificationdata)
    {
        ArrayList arraylist;
        String s;
        String s1;
        Context context;
        String s2;
        byte byte0;
        boolean flag1;
        int i1;
        flag1 = false;
        arraylist = new ArrayList();
        s = a(tripnotificationdata, false);
        s1 = a(tripnotificationdata, true);
        context = e();
        i1 = tripnotificationdata.getMessageIdentifier().intValue();
        s2 = tripnotificationdata.getTripStatus();
        byte0 = -1;
        s2.hashCode();
        JVM INSTR lookupswitch 5: default 108
    //                   -2146525273: 162
    //                   -1325796731: 194
    //                   -734206867: 178
    //                   1065961768: 146
    //                   2130210069: 210;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        byte0;
        JVM INSTR tableswitch 0 4: default 144
    //                   0 226
    //                   1 497
    //                   2 602
    //                   3 666
    //                   4 690;
           goto _L7 _L8 _L9 _L10 _L11 _L12
_L7:
        return false;
_L5:
        if (s2.equals("dispatching"))
        {
            byte0 = 0;
        }
          goto _L1
_L2:
        if (s2.equals("accepted"))
        {
            byte0 = 1;
        }
          goto _L1
_L4:
        if (s2.equals("arrived"))
        {
            byte0 = 2;
        }
          goto _L1
_L3:
        if (s2.equals("on_trip"))
        {
            byte0 = 3;
        }
          goto _L1
_L6:
        if (s2.equals("redispatching"))
        {
            byte0 = 4;
        }
          goto _L1
_L8:
        String s3 = context.getString(0x7f0702e7);
        arraylist.add(s3);
        String s5 = tripnotificationdata.getVehicleViewMonoImageUrl();
        if (!TextUtils.isEmpty(s5))
        {
            builder.setLargeIcon(g.a(s5, g.a(), true));
        }
        builder.setContentTitle(s3);
        builder.setProgress(0, 0, true);
        a(builder, i1);
_L17:
        boolean flag2;
        if (tripnotificationdata.getSource() == com.ubercab.client.feature.notification.model.NotificationData.Source.UPDATE)
        {
            arraylist.clear();
        }
        flag2 = i.p();
        if (flag2)
        {
            List list = tripnotificationdata.getAcceptedFareSplitClientsSince(p);
            if (list != null && !list.isEmpty())
            {
                arraylist.add(context.getString(0x7f0702ed, new Object[] {
                    gjw.a(", ").a(gki.a(list, new gjv() {

                        final elg a;

                        private static String a(com.ubercab.client.feature.notification.model.TripNotificationData.FareSplitClient faresplitclient)
                        {
                            return faresplitclient.getName();
                        }

                        public final Object apply(Object obj)
                        {
                            return a((com.ubercab.client.feature.notification.model.TripNotificationData.FareSplitClient)obj);
                        }

            
            {
                a = elg.this;
                super();
            }
                    }))
                }));
            }
        }
        if (!arraylist.isEmpty())
        {
            builder.setTicker(gjw.a("\n").a(arraylist));
        }
        if (s2.equals("accepted")) goto _L14; else goto _L13
_L13:
        boolean flag = flag1;
        if (!s2.equals("arrived")) goto _L15; else goto _L14
_L14:
        flag = true;
_L15:
        String s4;
        if (flag2 && tripnotificationdata.hasFareSplit() && tripnotificationdata.isMaster())
        {
            builder.setContentText(e(tripnotificationdata));
            builder.setStyle(a(builder, tripnotificationdata, s1));
        } else
        if (flag)
        {
            builder.setContentText(s);
            builder.setStyle(b(builder, tripnotificationdata, s1));
        } else
        {
            builder.setContentText(s);
        }
        return true;
_L9:
        s4 = context.getString(0x7f0702e0);
        if (tripnotificationdata.getSurgeMultiplier() > 1.0F)
        {
            arraylist.add(context.getString(0x7f0702e1, new Object[] {
                Float.valueOf(tripnotificationdata.getSurgeMultiplier())
            }));
        } else
        {
            arraylist.add(s4);
        }
        builder.setLargeIcon(g.a(tripnotificationdata.getTripEta()));
        builder.setContentTitle(s4);
        a(builder, tripnotificationdata, i1);
        if (m)
        {
            a(builder);
        }
        continue; /* Loop/switch isn't completed */
_L10:
        s4 = context.getString(0x7f0702e2);
        arraylist.add(s4);
        builder.setLargeIcon(g.a(tripnotificationdata.getTripEta()));
        builder.setContentTitle(s4);
        a(builder, tripnotificationdata, i1);
        if (l)
        {
            a(builder);
        }
        continue; /* Loop/switch isn't completed */
_L11:
        builder.setContentTitle(context.getString(0x7f0702ec));
        a(builder, tripnotificationdata, i1);
        continue; /* Loop/switch isn't completed */
_L12:
        s4 = context.getString(0x7f0702f4, new Object[] {
            tripnotificationdata.getDriverName()
        });
        arraylist.add(context.getString(0x7f0702f3, new Object[] {
            s4, s
        }));
        builder.setLargeIcon(g.a(tripnotificationdata.getVehicleViewMonoImageUrl(), g.a(), true));
        builder.setContentTitle(s4);
        builder.setProgress(0, 0, true);
        a(builder, i1);
        if (true) goto _L17; else goto _L16
_L16:
    }

    private android.support.v4.app.NotificationCompat.BigPictureStyle b(android.support.v4.app.NotificationCompat.Builder builder, TripNotificationData tripnotificationdata, String s)
    {
        return (new android.support.v4.app.NotificationCompat.BigPictureStyle(builder)).setSummaryText(s).bigPicture(g.a(tripnotificationdata, tripnotificationdata.isMaster()));
    }

    private void b(android.support.v4.app.NotificationCompat.Builder builder, int i1)
    {
        android.app.PendingIntent pendingintent = c(i1, "com.ubercab.client.ACTION_TRIP_SPLIT_FARE");
        builder.addAction(0x7f020187, e().getString(0x7f070442), pendingintent);
    }

    private void b(TripNotificationData tripnotificationdata)
    {
        Object obj1 = e();
        Object obj = c(tripnotificationdata.getMessageIdentifier().intValue(), "com.ubercab.client.ACTION_TRIP_SHOW_MAP");
        String s = ((Context) (obj1)).getString(0x7f0702e5, new Object[] {
            tripnotificationdata.getDriverName()
        });
        String s1 = ((Context) (obj1)).getString(0x7f0702e3);
        obj1 = ((Context) (obj1)).getString(0x7f0702e4, new Object[] {
            s, s1
        });
        obj = (new android.support.v4.app.NotificationCompat.Builder(e())).setSmallIcon(0x7f020191).setWhen(0L).setAutoCancel(true).setContentTitle(s).setContentText(s1).setContentIntent(((android.app.PendingIntent) (obj))).setDeleteIntent(b(7, null)).setTicker(((CharSequence) (obj1)));
        ((android.support.v4.app.NotificationCompat.Builder) (obj)).setStyle((new android.support.v4.app.NotificationCompat.BigTextStyle(((android.support.v4.app.NotificationCompat.Builder) (obj)))).setBigContentTitle(s).bigText(s1));
        a(7, tripnotificationdata.getTag(), ((android.support.v4.app.NotificationCompat.Builder) (obj)).build());
    }

    private void c(android.support.v4.app.NotificationCompat.Builder builder, int i1)
    {
        android.app.PendingIntent pendingintent = c(i1, "com.ubercab.client.ACTION_TRIP_SHARE_ETA");
        builder.addAction(0x7f020186, e().getString(0x7f0703f8), pendingintent);
    }

    private void c(TripNotificationData tripnotificationdata)
    {
        Object obj = c(tripnotificationdata.getMessageIdentifier().intValue(), "com.ubercab.client.ACTION_TRIP_SHOW_MAP");
        obj = (new android.support.v4.app.NotificationCompat.Builder(e())).setSmallIcon(0x7f020191).setContentIntent(((android.app.PendingIntent) (obj))).setDeleteIntent(b(1, null)).setWhen(0L);
        String s = tripnotificationdata.getFallbackText();
        if (!TextUtils.isEmpty(s))
        {
            ((android.support.v4.app.NotificationCompat.Builder) (obj)).setContentText(s);
            ((android.support.v4.app.NotificationCompat.Builder) (obj)).setTicker(s);
        } else
        if (!a(((android.support.v4.app.NotificationCompat.Builder) (obj)), tripnotificationdata))
        {
            a(1, tripnotificationdata.getTag());
            return;
        }
        obj = ((android.support.v4.app.NotificationCompat.Builder) (obj)).build();
        if (tripnotificationdata.getSource() != com.ubercab.client.feature.notification.model.NotificationData.Source.PUSH)
        {
            obj.defaults = 0;
            obj.sound = null;
            obj.vibrate = null;
        }
        a(1, tripnotificationdata.getTag(), ((Notification) (obj)));
    }

    private void d(android.support.v4.app.NotificationCompat.Builder builder, int i1)
    {
        android.app.PendingIntent pendingintent = c(i1, "com.ubercab.client.ACTION_SAFETYNET_SHARE_TRIP");
        builder.addAction(0x7f020190, e().getString(0x7f0703c0), pendingintent);
    }

    private void d(TripNotificationData tripnotificationdata)
    {
        if (tripnotificationdata == null)
        {
            return;
        } else
        {
            a(1, tripnotificationdata.getTag());
            h();
            f(null);
            return;
        }
    }

    private CharSequence e(TripNotificationData tripnotificationdata)
    {
        int i1 = tripnotificationdata.getJoinedFareSplitClientsCount();
        int j1 = tripnotificationdata.getFareSplitClients().size();
        tripnotificationdata = e();
        if (i1 == 0)
        {
            return tripnotificationdata.getString(0x7f0702ea);
        }
        if (i1 != j1)
        {
            return tripnotificationdata.getString(0x7f0702e9, new Object[] {
                Integer.valueOf(i1), Integer.valueOf(j1)
            });
        }
        if (j1 == 1)
        {
            return tripnotificationdata.getString(0x7f0702eb, new Object[] {
                Integer.valueOf(j1)
            });
        } else
        {
            return tripnotificationdata.getString(0x7f0702e9, new Object[] {
                Integer.valueOf(i1), Integer.valueOf(j1)
            });
        }
    }

    private void e(android.support.v4.app.NotificationCompat.Builder builder, int i1)
    {
        android.app.PendingIntent pendingintent = c(i1, "com.ubercab.client.ACTION_TRIP_ADD_DESTINATION");
        builder.addAction(0x7f020185, e().getString(0x7f07003c), pendingintent);
    }

    private void f(TripNotificationData tripnotificationdata)
    {
        p = tripnotificationdata;
        android.content.SharedPreferences.Editor editor = f().edit();
        if (tripnotificationdata == null)
        {
            editor.remove("trip_last_data");
        } else
        {
            try
            {
                editor.putString("trip_last_data", f.a(tripnotificationdata));
            }
            // Misplaced declaration of an exception variable
            catch (TripNotificationData tripnotificationdata)
            {
                editor.remove("trip_last_data");
            }
        }
        editor.apply();
    }

    private void g()
    {
        this;
        JVM INSTR monitorenter ;
        if (!o)
        {
            Intent intent = new Intent(e(), com/ubercab/client/feature/notification/NotificationBackgroundConnectionService);
            o = e().bindService(intent, k, 1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void h()
    {
        this;
        JVM INSTR monitorenter ;
        if (o)
        {
            o = false;
            e().unbindService(k);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a()
    {
        h();
        f(null);
    }

    public final volatile void a(NotificationData notificationdata)
    {
        a((TripNotificationData)notificationdata);
    }

    public final void a(TripNotificationData tripnotificationdata)
    {
        boolean flag1 = false;
        String s = tripnotificationdata.getTripStatus();
        if (!TextUtils.isEmpty(s))
        {
            TripNotificationData tripnotificationdata1 = p;
            if (tripnotificationdata1 != null && !tripnotificationdata1.getTripId().equals(tripnotificationdata.getTripId()))
            {
                a(1, tripnotificationdata1.getTripId());
                a(7, tripnotificationdata1.getTripId());
                f(null);
            }
            if (tripnotificationdata1 == null || !tripnotificationdata1.equals(tripnotificationdata))
            {
                if (s.equals("canceled"))
                {
                    b(tripnotificationdata);
                }
                boolean flag;
                if (s.equals("accepted") || s.equals("arrived"))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (s.equals("ended") || s.equals("canceled"))
                {
                    flag1 = true;
                }
                if (flag)
                {
                    g();
                } else
                if (!flag1)
                {
                    h();
                } else
                {
                    d(tripnotificationdata);
                    return;
                }
                c(tripnotificationdata);
                f(tripnotificationdata);
                return;
            }
        }
    }

    public final void a(gmj gmj)
    {
        m = e.a(dbf.aD, dbh.b);
        boolean flag;
        if (m || e.a(dbf.aD, dbh.a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = flag;
    }

    public final void b()
    {
        SharedPreferences sharedpreferences;
        super.b();
        if (n == null || n.c())
        {
            n = ica.a(c.b(), c.f(), c.g(), c.h(), new eli((byte)0)).a(ico.a()).c(new elh(this, (byte)0));
        }
        sharedpreferences = f();
        if (!sharedpreferences.contains("trip_last_data"))
        {
            break MISSING_BLOCK_LABEL_135;
        }
        p = (TripNotificationData)f.a(sharedpreferences.getString("trip_last_data", null), com/ubercab/client/feature/notification/model/TripNotificationData);
        return;
        bkh bkh1;
        bkh1;
    }

    public final void c()
    {
        super.c();
        if (n != null)
        {
            n.b();
        }
        f(null);
    }

    public final void onPingClientResponseEvent(dmr dmr1)
    {
        while (p == null || dmr1.e()) 
        {
            return;
        }
        h();
        dmr1 = e();
        dmr1 = (new android.support.v4.app.NotificationCompat.Builder(dmr1)).setSmallIcon(0x7f020191).setContentIntent(c(p.getMessageIdentifier().intValue(), "com.ubercab.client.ACTION_TRIP_SHOW_MAP")).setContentTitle(dmr1.getString(0x7f0702db)).setContentText(dmr1.getString(0x7f0702da)).setDeleteIntent(b(1, null)).setWhen(0L).setVibrate(null).setSound(null);
        a(1, p.getTag(), dmr1.build());
    }

    public final void onPingEvent(dar dar1)
    {
        if (h.n())
        {
            return;
        }
        Ping ping = dar1.a();
        com.ubercab.client.core.model.City city = ping.getCity();
        dar1 = ping.getClient();
        com.ubercab.client.core.model.FareSplit faresplit;
        if (dar1 != null)
        {
            dar1 = dar1.getStatus();
        } else
        {
            dar1 = "";
        }
        if (dul.l(ping))
        {
            faresplit = ping.getFareSplit();
        } else
        {
            faresplit = null;
        }
        a(city, dar1, faresplit, dul.o(ping), ping.getTrip());
    }
}
