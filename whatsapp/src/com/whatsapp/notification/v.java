// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.notification;

import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.support.v4.app.NotificationManagerCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.whatsapp.App;
import com.whatsapp.Conversation;
import com.whatsapp.Main;
import com.whatsapp.MediaData;
import com.whatsapp.Voip;
import com.whatsapp.a88;
import com.whatsapp.a9n;
import com.whatsapp.abl;
import com.whatsapp.aoz;
import com.whatsapp.appwidget.WidgetProvider;
import com.whatsapp.asa;
import com.whatsapp.g;
import com.whatsapp.k;
import com.whatsapp.o4;
import com.whatsapp.og;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.u5;
import com.whatsapp.util.Log;
import com.whatsapp.util.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.whatsapp.notification:
//            a1, PopupNotification, p, AndroidWear, 
//            m, q, PopupNotificationLocked, MessageNotificationDismissedReceiver, 
//            h

final class v
    implements Runnable
{

    private static final HashMap a;
    private static final String e[];
    private static final String z[];
    private final boolean b;
    private final boolean c;
    private final a1 d;
    private final boolean f;
    private final boolean g;

    public v(a1 a1_1, boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        d = a1_1;
        f = flag;
        g = flag1;
        c = flag2;
        b = flag3;
    }

    private boolean a(SharedPreferences sharedpreferences)
    {
        Object obj;
        String s;
        String s1;
        String s2;
        String s3;
        obj = com.whatsapp.notification.a1.c();
        int i = ((a1) (obj)).a(sharedpreferences, g.GROUP);
        int j = ((a1) (obj)).a(sharedpreferences, g.INDIVIDUAL);
        obj = sharedpreferences.getString(z[3], null);
        s = sharedpreferences.getString(z[7], null);
        s1 = sharedpreferences.getString(z[8], z[0]);
        s2 = sharedpreferences.getString(z[4], z[2]);
        s3 = sharedpreferences.getString(z[1], "1");
        sharedpreferences = sharedpreferences.getString(z[9], "1");
        if (i != 0 || j != 0)
        {
            break MISSING_BLOCK_LABEL_232;
        }
        boolean flag = TextUtils.isEmpty(((CharSequence) (obj)));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_232;
        }
        flag = TextUtils.isEmpty(s);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_232;
        }
        flag = TextUtils.equals(z[5], s1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_232;
        }
        flag = TextUtils.equals(z[6], s2);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_232;
        }
        flag = TextUtils.equals("0", s3);
        if (flag)
        {
            boolean flag1;
            try
            {
                flag1 = TextUtils.equals("0", sharedpreferences);
            }
            // Misplaced declaration of an exception variable
            catch (SharedPreferences sharedpreferences)
            {
                throw sharedpreferences;
            }
            if (flag1)
            {
                return true;
            }
        }
        break MISSING_BLOCK_LABEL_232;
        sharedpreferences;
        try
        {
            throw sharedpreferences;
        }
        // Misplaced declaration of an exception variable
        catch (SharedPreferences sharedpreferences) { }
        try
        {
            throw sharedpreferences;
        }
        // Misplaced declaration of an exception variable
        catch (SharedPreferences sharedpreferences) { }
        try
        {
            throw sharedpreferences;
        }
        // Misplaced declaration of an exception variable
        catch (SharedPreferences sharedpreferences) { }
        try
        {
            throw sharedpreferences;
        }
        // Misplaced declaration of an exception variable
        catch (SharedPreferences sharedpreferences) { }
        throw sharedpreferences;
        return false;
    }

    public static boolean a(Uri uri)
    {
        Object obj;
        Exception exception1;
        exception1 = null;
        obj = (Boolean)a.get(uri);
        if (obj == null) goto _L2; else goto _L1
_L1:
        boolean flag;
        try
        {
            flag = ((Boolean) (obj)).booleanValue();
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw uri;
        }
_L4:
        return flag;
_L2:
        obj = App.d.query(uri, e, z[10], null, z[11]);
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        int i = ((Cursor) (obj)).getCount();
        if (i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        a.put(uri, Boolean.TRUE);
        flag = true;
        if (obj != null)
        {
            try
            {
                ((Cursor) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
            return true;
        }
        if (true) goto _L4; else goto _L3
        exception1;
        try
        {
            throw exception1;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception1) { }
        finally { }
_L8:
        if (obj != null)
        {
            try
            {
                ((Cursor) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
        }
_L6:
        a.put(uri, Boolean.FALSE);
        return false;
_L3:
        if (obj != null)
        {
            try
            {
                ((Cursor) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        uri;
        obj = exception1;
        if (obj != null)
        {
            try
            {
                ((Cursor) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
        }
        throw uri;
        Exception exception;
        exception;
        exception = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
label0:
        {
            if (obj != null)
            {
                Class class1;
                Class class2;
                try
                {
                    class1 = getClass();
                    class2 = obj.getClass();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
                if (class1 == class2)
                {
                    break label0;
                }
            }
            return false;
        }
        obj = (v)obj;
        boolean flag;
        boolean flag1;
        flag = b;
        flag1 = ((v) (obj)).b;
        if (flag != flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = f;
        flag1 = ((v) (obj)).f;
        if (flag != flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = c;
        flag1 = ((v) (obj)).c;
        if (flag != flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = g;
        flag1 = ((v) (obj)).g;
        if (flag != flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            flag = d.equals(((v) (obj)).d);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (flag) goto _L1; else goto _L3
_L3:
        return false;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
    }

    public int hashCode()
    {
        int i1 = 1;
        int j1 = d.hashCode();
        int i;
        int j;
        int l;
        boolean flag;
        try
        {
            flag = f;
        }
        catch (NumberFormatException numberformatexception)
        {
            throw numberformatexception;
        }
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        try
        {
            flag = g;
        }
        catch (NumberFormatException numberformatexception1)
        {
            throw numberformatexception1;
        }
        if (flag)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        try
        {
            flag = c;
        }
        catch (NumberFormatException numberformatexception2)
        {
            throw numberformatexception2;
        }
        if (flag)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        try
        {
            flag = b;
        }
        catch (NumberFormatException numberformatexception3)
        {
            throw numberformatexception3;
        }
        if (!flag)
        {
            i1 = 0;
        }
        return (l + (j + (i + j1 * 31) * 31) * 31) * 31 + i1;
    }

    public void run()
    {
        boolean flag1 = PopupNotification.q;
        if (App.f(App.au) == 3) goto _L2; else goto _L1
_L1:
        Log.i(z[27]);
_L16:
        return;
        NumberFormatException numberformatexception;
        numberformatexception;
        throw numberformatexception;
_L2:
        Object obj;
        Object obj1;
        StringBuilder stringbuilder;
        Object obj11;
        NotificationManagerCompat notificationmanagercompat;
        TelephonyManager telephonymanager;
        StringBuilder stringbuilder1;
        SharedPreferences sharedpreferences;
        Object obj15;
        int i;
        int j;
        sharedpreferences = App.au.getSharedPreferences(z[25], 0);
        try
        {
            if (a(sharedpreferences))
            {
                Log.i(z[39]);
                return;
            }
        }
        catch (NumberFormatException numberformatexception1)
        {
            throw numberformatexception1;
        }
        telephonymanager = (TelephonyManager)App.au.getSystemService(z[18]);
        notificationmanagercompat = NotificationManagerCompat.from(App.au);
        stringbuilder1 = new StringBuilder();
        stringbuilder = new StringBuilder();
        obj15 = u5.d();
        obj11 = ((ArrayList) (obj15)).iterator();
        i = 0;
        j = 0;
        obj = null;
        obj1 = null;
_L108:
        if (!((Iterator) (obj11)).hasNext()) goto _L4; else goto _L3
_L3:
        Object obj8;
        String s = (String)((Iterator) (obj11)).next();
        obj8 = App.az.e(s);
        if (((og) (obj8)).c <= 0) goto _L6; else goto _L5
_L5:
        c4 c4_1;
        int l;
        l = j + ((og) (obj8)).c;
        i++;
        c4_1 = App.ah.n(((og) (obj8)).a);
        if (c4_1 == null) goto _L8; else goto _L7
_L7:
        if (obj1 == null) goto _L10; else goto _L9
_L9:
        String s3;
        long l2;
        long l4;
        try
        {
            l2 = ((c4) (obj1)).I;
            l4 = c4_1.I;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (l2 >= l4) goto _L11; else goto _L10
_L10:
        obj = c4_1;
        obj1 = obj8;
_L106:
        try
        {
            stringbuilder.append(c4_1.y.c).append(c4_1.y.b).append(c4_1.y.a);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (!flag1) goto _L13; else goto _L12
_L12:
        Log.w((new StringBuilder()).append(z[42]).append(((og) (obj8)).a).append(" ").append(((og) (obj8)).c).toString());
        j = i;
        i = l;
_L107:
        if (!flag1) goto _L15; else goto _L14
_L14:
        s3 = o4.b(stringbuilder.toString());
        String s1 = sharedpreferences.getString(z[12], null);
        try
        {
            if (s3.equals(s1))
            {
                Log.i((new StringBuilder()).append(z[22]).append(s3).toString());
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (j == 0 || obj1 == null)
        {
            try
            {
                notificationmanagercompat.cancel(1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        boolean flag;
        if (!((og) (obj1)).k())
        {
            break MISSING_BLOCK_LABEL_475;
        }
        flag = com.whatsapp.notification.p.a(App.au, ((og) (obj1)).a);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_475;
        }
        flag = f;
        if (flag)
        {
            try
            {
                WidgetProvider.a(App.au);
                App.z();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
          goto _L16
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
        if (obj1 == null && !flag1) goto _L18; else goto _L17
_L17:
        obj8 = d;
        flag = ((og) (obj1)).k();
        Object obj2;
        android.support.v4.app.NotificationCompat.Builder builder;
        int i1;
        int i2;
        Object obj9;
        Object obj10;
        Object obj12;
        Object obj13;
        Object obj14;
        String s2;
        StringBuilder stringbuilder2;
        int j1;
        int k1;
        int l1;
        int j2;
        long l3;
        long l5;
        boolean flag2;
        if (flag)
        {
            try
            {
                obj2 = g.GROUP;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        } else
        {
            obj2 = g.INDIVIDUAL;
        }
        l = ((a1) (obj8)).a(sharedpreferences, ((g) (obj2)));
_L105:
        stringbuilder2 = new StringBuilder();
        if (j != 1)
        {
            break MISSING_BLOCK_LABEL_614;
        }
        obj2 = com.whatsapp.util.c.b(((og) (obj1)).a(App.au));
        if (i != 1)
        {
            break MISSING_BLOCK_LABEL_574;
        }
        stringbuilder2.append(com.whatsapp.util.c.b(com.whatsapp.notification.p.a(App.au, ((c4) (obj)), ((og) (obj1)), false, false)));
        s2 = ((String) (obj2));
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_688;
        }
        try
        {
            stringbuilder2.append(String.format(App.j.a(0x7f0d0023, i), new Object[] {
                Integer.valueOf(i)
            }));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        s2 = ((String) (obj2));
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_688;
        }
        s2 = App.au.getString(0x7f0e0047);
        obj2 = String.format(App.j.a(0x7f0d0024, i), new Object[] {
            Integer.valueOf(i)
        });
        stringbuilder2.append(String.format(App.j.a(0x7f0d0025, j), new Object[] {
            obj2, Integer.valueOf(j)
        }));
        try
        {
            if (f)
            {
                break; /* Loop/switch isn't completed */
            }
            flag = b;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if (!flag) goto _L16; else goto _L19
_L19:
        builder = new android.support.v4.app.NotificationCompat.Builder(App.au);
        builder.setCategory(z[55]);
        if (!((og) (obj1)).k())
        {
            obj2 = ((og) (obj1)).a(App.d);
            if (obj2 != null)
            {
                try
                {
                    builder.addPerson(((Uri) (obj2)).toString());
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
            }
        }
        builder.setGroup(z[29]);
        builder.setGroupSummary(true);
        obj8 = null;
        i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 < 16 || j != 1)
        {
            break MISSING_BLOCK_LABEL_4326;
        }
        i1 = ((c4) (obj)).w;
        if (i1 != 1)
        {
            break MISSING_BLOCK_LABEL_4326;
        }
        try
        {
            obj2 = ((c4) (obj)).B;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_4326;
        }
        obj8 = App.r(((c4) (obj)));
        obj2 = obj8;
_L104:
        try
        {
            i1 = android.os.Build.VERSION.SDK_INT;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if (i1 >= 11 && obj1 != null && j == 1)
        {
            j1 = Math.min(App.au.getResources().getDimensionPixelSize(0x1050005), App.au.getResources().getDimensionPixelSize(0x1050006));
            try
            {
                i1 = android.os.Build.VERSION.SDK_INT;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (i1 >= 21)
            {
                i1 = -1;
            } else
            {
                i1 = 0;
            }
            obj10 = ((og) (obj1)).a(j1, i1);
            obj9 = obj10;
            if (obj10 == null)
            {
                try
                {
                    flag = ((og) (obj1)).C;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    try
                    {
                        throw obj;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        throw obj;
                    }
                }
                obj9 = obj10;
                if (flag)
                {
                    obj9 = obj10;
                    if (j1 > 0)
                    {
                        obj9 = ((og) (obj1)).a(j1, i1, true);
                    }
                }
            }
            if (obj9 != null)
            {
                try
                {
                    stringbuilder1.append(z[43]);
                    builder.setLargeIcon(((android.graphics.Bitmap) (obj9)));
                    flag = AndroidWear.b();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    try
                    {
                        throw obj;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        throw obj;
                    }
                }
                if (flag && obj8 == null)
                {
                    obj8 = obj9;
                }
            }
        }
        try
        {
            i1 = android.os.Build.VERSION.SDK_INT;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        obj14 = obj;
        obj11 = obj1;
        l1 = i;
        j2 = j;
        i2 = l;
        if (i1 < 16) goto _L21; else goto _L20
_L20:
        obj12 = obj8;
        obj9 = obj;
        obj10 = obj1;
        i1 = i;
        j1 = j;
        k1 = l;
        obj13 = obj2;
        if (i <= 1) goto _L23; else goto _L22
_L22:
        obj9 = new ArrayList();
        obj14 = new ArrayList();
        obj10 = ((ArrayList) (obj15)).iterator();
        do
        {
            if (!((Iterator) (obj10)).hasNext())
            {
                break;
            }
            obj11 = (String)((Iterator) (obj10)).next();
            obj11 = d.a(((String) (obj11)));
            try
            {
                if (((List) (obj11)).size() > 0)
                {
                    ((ArrayList) (obj14)).add(((List) (obj11)).get(0));
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            ((ArrayList) (obj9)).addAll(((java.util.Collection) (obj11)));
        } while (!flag1);
        Collections.sort(((List) (obj9)), new m(this));
        if (((ArrayList) (obj9)).size() <= 1) goto _L25; else goto _L24
_L24:
        obj10 = new android.support.v4.app.NotificationCompat.InboxStyle();
        i1 = Math.max(0, ((ArrayList) (obj9)).size() - 7);
_L103:
        if (i1 >= ((ArrayList) (obj9)).size()) goto _L27; else goto _L26
_L26:
        obj11 = (c4)((ArrayList) (obj9)).get(i1);
        obj12 = App.az.e(((c4) (obj11)).y.a);
        try
        {
            obj13 = App.au;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (j > 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj11 = com.whatsapp.util.c.b(com.whatsapp.notification.p.a(((android.content.Context) (obj13)), ((c4) (obj11)), ((og) (obj12)), flag, false));
        ((android.support.v4.app.NotificationCompat.InboxStyle) (obj10)).addLine(((CharSequence) (obj11)));
        stringbuilder1.append(z[51]).append(i1).append("(").append(((String) (obj11)).length()).append(")");
        if (!flag1) goto _L28; else goto _L27
_L27:
        ((android.support.v4.app.NotificationCompat.InboxStyle) (obj10)).setSummaryText(stringbuilder2);
        builder.setStyle(((android.support.v4.app.NotificationCompat.Style) (obj10)));
        stringbuilder1.append(z[23]).append(Math.min(8, ((ArrayList) (obj9)).size()));
_L25:
        obj12 = obj8;
        obj9 = obj;
        obj10 = obj1;
        i1 = i;
        j1 = j;
        k1 = l;
        obj13 = obj2;
        if (!AndroidWear.b()) goto _L30; else goto _L29
_L29:
        flag = b;
        if (!flag) goto _L32; else goto _L31
_L31:
        obj12 = obj8;
        obj9 = obj;
        obj10 = obj1;
        i1 = i;
        j1 = j;
        k1 = l;
        obj13 = obj2;
        if (j > 1) goto _L30; else goto _L32
_L32:
        Collections.sort(((List) (obj14)), new m(this));
        obj15 = new android.support.v4.app.NotificationCompat.Builder(App.au);
        ((android.support.v4.app.NotificationCompat.Builder) (obj15)).setGroup(z[35]);
        ((android.support.v4.app.NotificationCompat.Builder) (obj15)).setSmallIcon(0x7f0205da);
        ((android.support.v4.app.NotificationCompat.Builder) (obj15)).setOnlyAlertOnce(true);
        i1 = 0;
_L36:
        if (i1 >= Math.max(0, ((ArrayList) (obj14)).size() - 7)) goto _L34; else goto _L33
_L33:
        notificationmanagercompat.cancel(((c4)((ArrayList) (obj14)).get(i1)).y.a, 1);
        i1++;
        if (!flag1) goto _L36; else goto _L35
_L35:
        obj9 = obj2;
        j1 = l;
        k1 = j;
        l1 = i;
        obj10 = obj1;
        obj11 = obj;
        obj12 = obj8;
_L39:
        obj2 = obj9;
        i2 = i1;
        l = j1;
        j = k1;
        i = l1;
        obj1 = obj10;
        obj = obj11;
        obj8 = obj12;
_L102:
        obj12 = obj8;
        obj9 = obj;
        obj10 = obj1;
        i1 = i;
        j1 = j;
        k1 = l;
        obj13 = obj2;
        if (i2 >= ((ArrayList) (obj14)).size()) goto _L30; else goto _L37
_L37:
        obj10 = (c4)((ArrayList) (obj14)).get(i2);
        obj9 = App.az.e(((c4) (obj10)).y.a);
        ((android.support.v4.app.NotificationCompat.Builder) (obj15)).setWhen(((c4) (obj10)).I);
        obj10 = com.whatsapp.notification.p.a(App.au, ((c4) (obj10)), ((og) (obj9)));
        try
        {
            ((android.support.v4.app.NotificationCompat.Builder) (obj15)).setContentTitle(com.whatsapp.util.c.b(((q) (obj10)).a()));
            ((android.support.v4.app.NotificationCompat.Builder) (obj15)).setContentText(com.whatsapp.util.c.b(((q) (obj10)).b()));
            obj10 = App.au;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (j == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((android.support.v4.app.NotificationCompat.Builder) (obj15)).extend(com.whatsapp.notification.AndroidWear.a(((android.content.Context) (obj10)), ((og) (obj9)), false, null, flag, ((android.graphics.Bitmap) (obj8))));
        obj10 = Conversation.a(App.au, ((og) (obj9)));
        ((android.support.v4.app.NotificationCompat.Builder) (obj15)).setContentIntent(PendingIntent.getActivity(App.au, 0, ((Intent) (obj10)), 0));
        notificationmanagercompat.notify(((og) (obj9)).a, 1, ((android.support.v4.app.NotificationCompat.Builder) (obj15)).build());
        i1 = i2 + 1;
        obj12 = obj8;
        obj11 = obj;
        obj10 = obj1;
        l1 = i;
        k1 = j;
        j1 = l;
        obj9 = obj2;
        if (!flag1) goto _L39; else goto _L38
_L38:
        obj13 = obj2;
        k1 = l;
        j1 = j;
        i1 = i;
        obj10 = obj1;
        obj9 = obj;
        obj12 = obj8;
_L30:
        obj14 = obj9;
        obj11 = obj10;
        l1 = i1;
        j2 = j1;
        i2 = k1;
        if (!flag1) goto _L21; else goto _L23
_L23:
        flag = AndroidWear.b();
        if (flag)
        {
            try
            {
                builder.extend(com.whatsapp.notification.AndroidWear.a(App.au, ((og) (obj10)), true, ((c4) (obj9)), true, ((android.graphics.Bitmap) (obj12))));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        i = 0;
        if (obj13 != null)
        {
            obj = new android.support.v4.app.NotificationCompat.BigPictureStyle();
            ((android.support.v4.app.NotificationCompat.BigPictureStyle) (obj)).setSummaryText(stringbuilder2);
            ((android.support.v4.app.NotificationCompat.BigPictureStyle) (obj)).bigPicture(((android.graphics.Bitmap) (obj13)));
            builder.setStyle(((android.support.v4.app.NotificationCompat.Style) (obj)));
            i = 1;
            stringbuilder1.append(z[37]);
        }
        if (i == 0)
        {
            obj = new android.support.v4.app.NotificationCompat.BigTextStyle();
            ((android.support.v4.app.NotificationCompat.BigTextStyle) (obj)).bigText(stringbuilder2);
            ((android.support.v4.app.NotificationCompat.BigTextStyle) (obj)).setSummaryText(String.format(App.j.a(0x7f0d0023, i1), new Object[] {
                Integer.valueOf(i1)
            }));
            builder.setStyle(((android.support.v4.app.NotificationCompat.Style) (obj)));
            stringbuilder1.append(z[28]).append(stringbuilder2.length());
        }
        if (((c4) (obj9)).w == 2) goto _L41; else goto _L40
_L40:
        i = ((c4) (obj9)).w;
        obj14 = obj9;
        obj11 = obj10;
        l1 = i1;
        j2 = j1;
        i2 = k1;
        if (i != 1) goto _L21; else goto _L41
_L41:
        try
        {
            obj = ((c4) (obj9)).B;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        obj14 = obj9;
        obj11 = obj10;
        l1 = i1;
        j2 = j1;
        i2 = k1;
        if (obj == null) goto _L21; else goto _L42
_L42:
        obj = (MediaData)((c4) (obj9)).B;
        obj14 = obj9;
        obj11 = obj10;
        l1 = i1;
        j2 = j1;
        i2 = k1;
        if (!((MediaData) (obj)).transferred) goto _L21; else goto _L43
_L43:
        obj1 = ((MediaData) (obj)).file;
        obj14 = obj9;
        obj11 = obj10;
        l1 = i1;
        j2 = j1;
        i2 = k1;
        if (obj1 != null)
        {
            try
            {
                flag = ((MediaData) (obj)).file.exists();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            obj14 = obj9;
            obj11 = obj10;
            l1 = i1;
            j2 = j1;
            i2 = k1;
            if (flag)
            {
                obj = Conversation.a(((og) (obj10)));
                ((Intent) (obj)).setAction(z[31]);
                ((Intent) (obj)).putExtra(z[13], new a88(((c4) (obj9)).y));
                obj = PendingIntent.getActivity(App.au, 0, ((Intent) (obj)), 0x10000000);
                try
                {
                    i = ((c4) (obj9)).w;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
                if (i == 1)
                {
                    i = 0x7f0205d8;
                } else
                {
                    i = 0x7f0205d7;
                }
                try
                {
                    obj1 = App.au;
                    j = ((c4) (obj9)).w;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
                if (j == 1)
                {
                    j = 0x7f0e047a;
                } else
                {
                    j = 0x7f0e02eb;
                }
                builder.addAction(i, ((App) (obj1)).getString(j), ((PendingIntent) (obj)));
                i2 = k1;
                j2 = j1;
                l1 = i1;
                obj11 = obj10;
                obj14 = obj9;
            }
        }
_L21:
        l3 = System.currentTimeMillis();
        l5 = d.a;
        try
        {
            builder.setSmallIcon(0x7f0205da);
            if (!b)
            {
                builder.setTicker(p.b(App.au, ((c4) (obj14)), ((og) (obj11))));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        try
        {
            builder.setWhen(l3);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (l3 - l5 <= 200L) goto _L45; else goto _L44
_L44:
        flag = g;
        if (flag) goto _L45; else goto _L46
_L46:
        obj1 = "0";
        flag = Voip.h();
        obj = obj1;
        if (obj11 == null)
        {
            break MISSING_BLOCK_LABEL_2502;
        }
        obj = obj1;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_2502;
        }
        flag2 = ((og) (obj11)).k();
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_2453;
        }
        flag2 = p.e(App.au, ((og) (obj11)).a);
        obj = obj1;
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_2502;
        }
        try
        {
            flag2 = ((og) (obj11)).k();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (flag2)
        {
            obj = sharedpreferences.getString(z[17], "1");
            if (!flag1)
            {
                break MISSING_BLOCK_LABEL_2502;
            }
        }
        obj = sharedpreferences.getString(z[16], "1");
        stringbuilder1.append(z[40]).append(((String) (obj)));
        i = -1;
        boolean flag3;
        try
        {
            i1 = ((String) (obj)).hashCode();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        j = i;
        l = i;
        i1;
        JVM INSTR tableswitch 49 51: default 2564
    //                   49 3817
    //                   50 3841
    //                   51 3870;
           goto _L47 _L48 _L49 _L50
_L47:
        i;
        JVM INSTR tableswitch 0 2: default 2592
    //                   0 3903
    //                   1 3915
    //                   2 3957;
           goto _L51 _L52 _L53 _L54
_L51:
        try
        {
            i = telephonymanager.getCallState();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (i != 0 || obj11 == null) goto _L56; else goto _L55
_L55:
        obj = (a9n)de.greenrobot.event.g.a().a(com/whatsapp/a9n);
        obj2 = Conversation.B();
        if (((a9n) (obj)).a()) goto _L58; else goto _L57
_L57:
        flag2 = App.O();
        if (!flag2) goto _L58; else goto _L59
_L59:
        flag2 = ((asa) (obj2)).a();
        if (!flag2) goto _L58; else goto _L60
_L60:
        flag2 = ((asa) (obj2)).b().A.equals(((og) (obj11)).a);
        if (!flag2) goto _L58; else goto _L61
_L61:
        try
        {
            flag2 = Conversation.au;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (flag2)
        {
            stringbuilder1.append(z[30]);
            obj = z[24];
        } else
        {
            obj = null;
        }
_L98:
        if (flag && obj != null)
        {
            try
            {
                flag = ((String) (obj)).equals("");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (flag);
        }
        if (obj == null) goto _L56; else goto _L62
_L62:
        obj = Uri.parse(((String) (obj)));
        stringbuilder1.append(z[36]).append(obj);
        if (obj == null) goto _L56; else goto _L63
_L63:
        flag = ((og) (obj11)).k();
        if (!flag) goto _L65; else goto _L64
_L64:
        flag = p.e(App.au, ((og) (obj11)).a);
        if (flag) goto _L56; else goto _L65
_L65:
        i = android.os.Build.VERSION.SDK_INT;
        if (i < 21) goto _L67; else goto _L66
_L66:
        flag = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI.equals(obj);
        if (flag) goto _L69; else goto _L68
_L68:
        flag = a(((Uri) (obj)));
        if (!flag) goto _L67; else goto _L69
_L69:
        flag = ((asa) (obj2)).a();
        if (!flag) goto _L71; else goto _L70
_L70:
        flag = ((asa) (obj2)).b().c();
        if (flag) goto _L56; else goto _L71
_L71:
        builder.setSound(((Uri) (obj)));
        if (!flag1) goto _L56; else goto _L67
_L67:
        try
        {
            App.a(((Uri) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
_L56:
        if (obj11 != null)
        {
label0:
            {
                try
                {
                    flag = ((og) (obj11)).k();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
                if (flag)
                {
                    flag = sharedpreferences.getBoolean(z[20], true);
                    if (!flag1)
                    {
                        break label0;
                    }
                }
                flag = sharedpreferences.getBoolean(z[50], true);
            }
        } else
        {
            flag = false;
        }
        obj1 = (a9n)de.greenrobot.event.g.a().a(com/whatsapp/a9n);
        if (!flag) goto _L73; else goto _L72
_L72:
        flag2 = ((a9n) (obj1)).a();
        if (flag2) goto _L75; else goto _L74
_L74:
        obj = PopupNotification.s;
        if (obj == null) goto _L73; else goto _L76
_L76:
        flag2 = PopupNotification.s instanceof PopupNotificationLocked;
        if (!flag2) goto _L73; else goto _L75
_L75:
        try
        {
            flag2 = ((og) (obj11)).k();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (!flag2) goto _L78; else goto _L77
_L77:
        obj = sharedpreferences.getString(z[34], z[38]);
        if (!flag1) goto _L79; else goto _L78
_L78:
        obj = sharedpreferences.getString(z[19], z[52]);
_L79:
        if (obj == null) goto _L81; else goto _L80
_L80:
        try
        {
            i = Integer.parseInt(((String) (obj)), 16);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            i = 0xffffff;
        }
        i |= 0xff000000;
        if (i != 0xff000000)
        {
            try
            {
                builder.setLights(i, 1000, 4000);
                stringbuilder1.append(z[41]).append(Integer.toHexString(i));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if (!flag1) goto _L82; else goto _L81
_L81:
        try
        {
            stringbuilder1.append(z[46]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
_L82:
        if (!flag1) goto _L45; else goto _L73
_L73:
        try
        {
            stringbuilder1.append(z[48]).append(flag).append(z[53]).append(obj1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
_L45:
        if (j2 == 1)
        {
            try
            {
                obj = Conversation.a(((og) (obj11)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        } else
        {
            obj = new Intent(App.au, Main.g());
        }
        obj = PendingIntent.getActivity(App.au, 0, ((Intent) (obj)), 0x10000000);
        try
        {
            builder.setContentIntent(((PendingIntent) (obj)));
            builder.setContentTitle(s2);
            builder.setContentText(stringbuilder2);
            if (App.l >= 1)
            {
                stringbuilder1.append(z[47]).append(stringbuilder2);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        stringbuilder1.append(z[15]).append(s3);
        d.a = System.currentTimeMillis();
        Log.i((new StringBuilder()).append(z[44]).append(stringbuilder1.toString()).toString());
        if (f)
        {
            break MISSING_BLOCK_LABEL_3345;
        }
        flag = g;
        if (!flag)
        {
            try
            {
                Log.i((new StringBuilder()).append(z[21]).append(f).append(z[14]).append(g).append(z[45]).append(j2).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if (telephonymanager.getCallState() != 0) goto _L84; else goto _L83
_L83:
        flag = Voip.h();
        if (flag || obj11 == null || i2 == 0) goto _L84; else goto _L85
_L85:
        flag = c;
        if (flag) goto _L84; else goto _L86
_L86:
        flag = ((og) (obj11)).k();
        if (!flag) goto _L88; else goto _L87
_L87:
        flag = p.b(App.au, ((og) (obj11)).a);
        if (flag) goto _L84; else goto _L88
_L88:
        i = 1;
_L99:
        if (i != 0) goto _L90; else goto _L89
_L89:
        flag = b;
        if (!flag)
        {
            try
            {
                builder.setPriority(1);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
_L90:
        obj = new Intent(App.au, com/whatsapp/notification/MessageNotificationDismissedReceiver);
        ((Intent) (obj)).putExtra(z[33], s3);
        builder.setDeleteIntent(PendingIntent.getBroadcast(App.au, 1, ((Intent) (obj)), 0x8000000));
        builder.setColor(App.au.getResources().getColor(0x7f09002d));
        obj = builder.getNotification();
        flag = b;
        if (flag && l1 == 1)
        {
            try
            {
                notificationmanagercompat.cancel(1);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        notificationmanagercompat.notify(1, ((android.app.Notification) (obj)));
_L101:
        try
        {
            flag = b;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (flag) goto _L16; else goto _L91
_L91:
        obj1 = Conversation.B();
        if (!((asa) (obj1)).a()) goto _L93; else goto _L92
_L92:
        obj = null;
        if (obj11 != null)
        {
            obj = ((og) (obj11)).a;
        }
        try
        {
            ((asa) (obj1)).b().e(((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (!flag1) goto _L94; else goto _L93
_L93:
        Conversation.y();
_L94:
        if (i != 0)
        {
            try
            {
                App.au.ab().post(new h(App.au, i2));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        flag = f;
        if (flag && obj11 != null)
        {
            try
            {
                if (((og) (obj11)).k())
                {
                    com.whatsapp.notification.p.a(((og) (obj11)).a);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if (!f) goto _L16; else goto _L95
_L95:
        WidgetProvider.a(App.au);
        App.z();
        return;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
_L48:
        flag3 = ((String) (obj)).equals("1");
        if (!flag3) goto _L47; else goto _L96
_L96:
        j = 0;
        i = 0;
        if (!flag1) goto _L47; else goto _L49
_L49:
        try
        {
            flag3 = ((String) (obj)).equals("2");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        i = j;
        if (!flag3) goto _L47; else goto _L97
_L97:
        l = 1;
        i = 1;
        if (!flag1) goto _L47; else goto _L50
_L50:
        try
        {
            flag3 = ((String) (obj)).equals("3");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        i = l;
        if (flag3)
        {
            i = 2;
        }
          goto _L47
_L52:
        builder.setDefaults(2);
        if (!flag1) goto _L51; else goto _L53
_L53:
        builder.setVibrate(new long[] {
            0L, 300L, 200L, 300L, 200L
        });
        if (!flag1) goto _L51; else goto _L54
_L54:
        try
        {
            builder.setVibrate(new long[] {
                0L, 750L, 250L, 750L, 250L
            });
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
          goto _L51
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
_L58:
        stringbuilder1.append(z[54]);
        if (((og) (obj11)).k())
        {
            obj1 = sharedpreferences.getString(z[26], null);
        } else
        {
            obj1 = sharedpreferences.getString(z[49], null);
            obj = ((og) (obj11)).a(sharedpreferences);
            if (obj != null)
            {
                stringbuilder1.append(z[32]);
                obj1 = obj;
            }
        }
        obj = obj1;
        if (obj1 == null)
        {
            obj = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI.toString();
        }
          goto _L98
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
        obj;
        throw obj;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
_L84:
        i = 0;
          goto _L99
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        if (((SecurityException) (obj)).toString().contains(z[56])) goto _L101; else goto _L100
_L100:
        throw obj;
        obj;
        throw obj;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
_L34:
        i2 = i1;
          goto _L102
_L28:
        i1++;
          goto _L103
        obj2 = null;
          goto _L104
_L18:
        l = 0;
          goto _L105
_L11:
        Object obj3 = obj;
        obj = obj1;
        obj1 = obj3;
          goto _L106
_L8:
        Object obj4 = obj;
        obj = obj1;
        obj1 = obj4;
          goto _L12
_L6:
        Object obj5 = obj;
        l = i;
        obj = obj1;
        obj1 = obj5;
        i = j;
        j = l;
          goto _L107
_L4:
        Object obj6 = obj;
        l = i;
        obj = obj1;
        obj1 = obj6;
        i = j;
        j = l;
          goto _L14
_L15:
        l = j;
        Object obj7 = obj1;
        obj1 = obj;
        obj = obj7;
        j = i;
        i = l;
          goto _L108
_L13:
        j = i;
        i = l;
          goto _L107
    }

    static 
    {
        String as[];
        Object obj;
        String as1[];
        byte byte0;
        int i;
        as = new String[57];
        obj = "\036\016hT\t\036";
        byte0 = -1;
        as1 = as;
        i = 0;
_L10:
        int j;
        int l;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        j = 0;
_L7:
        if (l <= j)
        {
            obj = (new String(((char []) (obj)))).intern();
            byte byte1;
            char c1;
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "?:Ag?\007&Af&>1qd&::Of*\007$K|(, ";
                i = 1;
                as1 = as;
                byte0 = 0;
                continue; /* Loop/switch isn't completed */

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\036\016hT\t\036";
                i = 2;
                as1 = as;
                byte0 = 1;
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                as1 = as;
                obj = "?:Ag?\007&Af&>1qf 6-";
                byte0 = 2;
                continue; /* Loop/switch isn't completed */

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "6'Z{)!\027B{(0<qq 4'\\";
                byte0 = 3;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "hx\036\"\177h";
                byte0 = 4;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "hx\036\"\177h";
                byte0 = 5;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "6'Z{)!\027\\{!?<A|*";
                byte0 = 6;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "?:Ag?\007&Af&>1q~&? ZM,7$A`";
                byte0 = 7;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "6'Z{)!\027X{-*)Zw\0204-@u;0";
                byte0 = 8;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "1;q| ,!H{,9<G}!ey";
                byte0 = 9;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = ",!Z~*\007#Kk";
                byte0 = 10;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "6'Z{)1+Of&7&qz.+ ";
                byte0 = 11;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "3-W";
                byte0 = 12;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "x9[{*,u";
                byte0 = 13;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "x Oa'e";
                byte0 = 14;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "6'Z{)!\027X{-*)Zw\0204-@u;0";
                byte0 = 15;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "?:Ag?\007&Af&>1qd&::Of*\007$K|(, ";
                byte0 = 16;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 16: // '\020'
                as1[i] = ((String) (obj));
                obj = "( A|*";
                byte0 = 17;
                i = 18;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                as1 = as;
                obj = "6'Z{)!\027B{(0<qq 4'\\";
                byte0 = 18;
                continue; /* Loop/switch isn't completed */

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "?:Ag?\007&Af&>1q~&? Z";
                byte0 = 19;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "5-]a.?-@};1.Gq.,!A|`x&Ker";
                byte0 = 20;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "5-]a.?-@};1.Gq.,!A|`+)Cwo";
                byte0 = 21;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "x!@p  r";
                byte0 = 22;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "9&J` 1,\000`*+'[`,=r\001=,7%\000e'9<]s?(g\034#|ix\027+ymy";
                byte0 = 23;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = ";'C<80)Za.(8qb==.K`*6+Ka";
                byte0 = 24;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "?:Ag?\007&Af&>1qf 6-";
                byte0 = 25;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 27;
                obj = "6'Z{)1+Of&7&\016a:(8\\w<+-J(o6'Z2&6hXw=1.Gw+x:Ku&+<\\s;1'@2<,)Zw";
                byte0 = 26;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 28;
                obj = "x*Gu;=0Z(";
                byte0 = 27;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 27: // '\033'
                as1[i] = ((String) (obj));
                i = 29;
                obj = "?:Ag?\007#Kk\0205-]a.?-]";
                byte0 = 28;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 28: // '\034'
                as1[i] = ((String) (obj));
                i = 30;
                obj = "x<A|*e+A|9=:]s;1'@";
                byte0 = 29;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 29: // '\035'
                as1[i] = ((String) (obj));
                i = 31;
                obj = ";'C<80)Za.(8\000{!,-@fa9+Z{ 6f~^\016\001";
                byte0 = 30;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 30: // '\036'
                as1[i] = ((String) (obj));
                i = 32;
                obj = "x+[a;7%";
                byte0 = 31;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 31: // '\037'
                as1[i] = ((String) (obj));
                i = 33;
                obj = "6'Z{)1+Of&7&qz.+ ";
                byte0 = 32;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 32: // ' '
                as1[i] = ((String) (obj));
                i = 34;
                obj = "?:Ag?\007&Af&>1q~&? ZM,7$A`";
                byte0 = 33;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 33: // '!'
                as1[i] = ((String) (obj));
                i = 35;
                obj = "?:Ag?\007#Kk\0205-]a.?-]";
                byte0 = 34;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 34: // '"'
                as1[i] = ((String) (obj));
                i = 36;
                obj = "x;Ag!<u";
                byte0 = 35;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 35: // '#'
                as1[i] = ((String) (obj));
                i = 37;
                obj = "x*Gu?1+Zg==";
                byte0 = 36;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 36: // '$'
                as1[i] = ((String) (obj));
                i = 38;
                obj = "\036\016hT\t\036";
                byte0 = 37;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 37: // '%'
                as1[i] = ((String) (obj));
                i = 39;
                obj = "6'Z{)1+Of&7&]2+1;Op#=,";
                byte0 = 38;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 38: // '&'
                as1[i] = ((String) (obj));
                i = 40;
                obj = "x>Gp=9<K/";
                byte0 = 39;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 39: // '\''
                as1[i] = ((String) (obj));
                i = 41;
                obj = "x+A~ *u";
                byte0 = 40;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 40: // '('
                as1[i] = ((String) (obj));
                i = 42;
                obj = "5-]a.?-@};1.Gq.,!A|`;=\\\177<?g@g#4h";
                byte0 = 41;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 41: // ')'
                as1[i] = ((String) (obj));
                i = 43;
                obj = "x$O`(=!M}!";
                byte0 = 42;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 42: // '*'
                as1[i] = ((String) (obj));
                i = 44;
                obj = "5-]a.?-@};1.Gq.,!A|`6'Z{)!";
                byte0 = 43;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 43: // '+'
                as1[i] = ((String) (obj));
                i = 45;
                obj = "x+Ag!,u";
                byte0 = 44;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 44: // ','
                as1[i] = ((String) (obj));
                obj = "x+A~ *u@g#4";
                byte0 = 45;
                i = 46;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 45: // '-'
                as1[i] = ((String) (obj));
                i = 47;
                as1 = as;
                obj = "x%Ka<9/K/";
                byte0 = 46;
                continue; /* Loop/switch isn't completed */

            case 46: // '.'
                as1[i] = ((String) (obj));
                i = 48;
                obj = "x$Gu',u";
                byte0 = 47;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 47: // '/'
                as1[i] = ((String) (obj));
                i = 49;
                obj = "6'Z{)!\027\\{!?<A|*";
                byte0 = 48;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 48: // '0'
                as1[i] = ((String) (obj));
                i = 50;
                obj = "6'Z{)!\027B{(0<";
                byte0 = 49;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 49: // '1'
                as1[i] = ((String) (obj));
                i = 51;
                obj = "x$G|*b";
                byte0 = 50;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 50: // '2'
                as1[i] = ((String) (obj));
                i = 52;
                obj = "\036\016hT\t\036";
                byte0 = 51;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 51: // '3'
                as1[i] = ((String) (obj));
                i = 53;
                obj = "x;M`*=&q~ ;#\023";
                byte0 = 52;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 52: // '4'
                as1[i] = ((String) (obj));
                i = 54;
                obj = "x<A|*e&Af&>!Ms;1'@";
                byte0 = 53;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 53: // '5'
                as1[i] = ((String) (obj));
                i = 55;
                obj = "5;I";
                byte0 = 54;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 54: // '6'
                as1[i] = ((String) (obj));
                i = 56;
                obj = "9&J` 1,\000b**%Ga<1'@<\032\b\foF\n\007\t~B\020\027\030}M\034\f\tzA";
                byte0 = 55;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 55: // '7'
                as1[i] = ((String) (obj));
                z = as;
                as = new String[1];
                obj = "\007!J";
                byte0 = 56;
                as1 = as;
                i = 0;
                continue; /* Loop/switch isn't completed */

            case 56: // '8'
                as1[i] = ((String) (obj));
                break;
            }
            break; /* Loop/switch isn't completed */
        }
        c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 1468
    //                   0 1491
    //                   1 1498
    //                   2 1505
    //                   3 1512;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_1512;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte1 = 79;
_L8:
        obj[j] = (char)(byte1 ^ c1);
        j++;
        if (true) goto _L7; else goto _L6
_L6:
        byte1 = 88;
          goto _L8
_L3:
        byte1 = 72;
          goto _L8
_L4:
        byte1 = 46;
          goto _L8
        byte1 = 18;
          goto _L8
        if (true) goto _L10; else goto _L9
_L9:
        e = as;
        a = new HashMap();
    }
}
