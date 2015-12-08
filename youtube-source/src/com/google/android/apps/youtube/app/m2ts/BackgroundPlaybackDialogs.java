// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.m2ts;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.a.a.a.a.ai;
import com.google.android.apps.youtube.app.ui.hh;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.youtube.p;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

// Referenced classes of package com.google.android.apps.youtube.app.m2ts:
//            b, a

public final class BackgroundPlaybackDialogs
{

    private final Activity a;
    private final SharedPreferences b;
    private final hh c;
    private DialogType d;
    private long e;
    private ai f;

    public BackgroundPlaybackDialogs(Activity activity, SharedPreferences sharedpreferences, hh hh1)
    {
        a = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        b = (SharedPreferences)com.google.android.apps.youtube.common.fromguava.c.a(sharedpreferences);
        c = (hh)com.google.android.apps.youtube.common.fromguava.c.a(hh1);
        d = DialogType.NONE;
    }

    static SharedPreferences a(BackgroundPlaybackDialogs backgroundplaybackdialogs)
    {
        return backgroundplaybackdialogs.b;
    }

    public final void a()
    {
        d = DialogType.BACKGROUND_SUCCESS;
        e = System.currentTimeMillis();
        f = null;
    }

    public final void a(Bundle bundle)
    {
        bundle.putInt("background_dialog_type", d.ordinal());
        byte abyte0[];
        if (f != null)
        {
            abyte0 = com.google.protobuf.nano.c.a(f);
        } else
        {
            abyte0 = null;
        }
        bundle.putByteArray("background_failed_message", abyte0);
        bundle.putLong("background_start_time", e);
    }

    public final void a(ai ai1)
    {
        d = DialogType.BACKGROUND_FAILED;
        e = System.currentTimeMillis();
        f = ai1;
    }

    public final void b()
    {
        d = DialogType.NONE;
        e = 0L;
        f = null;
    }

    public final void b(Bundle bundle)
    {
        int i = bundle.getInt("background_dialog_type");
        if (i >= 0 || i < DialogType.values().length)
        {
            d = DialogType.values()[i];
        }
        byte abyte0[] = bundle.getByteArray("background_failed_message");
        if (abyte0 != null)
        {
            try
            {
                ai ai1 = new ai();
                com.google.protobuf.nano.c.a(ai1, abyte0);
                f = ai1;
            }
            catch (InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception) { }
        }
        e = bundle.getLong("background_start_time");
    }

    public final void c()
    {
        boolean flag;
        if (System.currentTimeMillis() - e < 30000L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        b.a[d.ordinal()];
        JVM INSTR tableswitch 1 2: default 56
    //                   1 62
    //                   2 146;
           goto _L2 _L3 _L4
_L2:
        return;
_L3:
        if (b.getBoolean("show_background_feature_dialog", true))
        {
            a a1 = new a(this);
            (new android.app.AlertDialog.Builder(a)).setMessage(p.F).setNegativeButton(p.G, a1).setPositiveButton(p.dA, null).create().show();
            b.edit().putBoolean("show_background_feature_dialog", false).apply();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (f != null)
        {
            c.a(f);
            return;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    private class DialogType extends Enum
    {

        private static final DialogType $VALUES[];
        public static final DialogType BACKGROUND_FAILED;
        public static final DialogType BACKGROUND_SUCCESS;
        public static final DialogType NONE;

        public static DialogType valueOf(String s)
        {
            return (DialogType)Enum.valueOf(com/google/android/apps/youtube/app/m2ts/BackgroundPlaybackDialogs$DialogType, s);
        }

        public static DialogType[] values()
        {
            return (DialogType[])$VALUES.clone();
        }

        static 
        {
            NONE = new DialogType("NONE", 0);
            BACKGROUND_SUCCESS = new DialogType("BACKGROUND_SUCCESS", 1);
            BACKGROUND_FAILED = new DialogType("BACKGROUND_FAILED", 2);
            $VALUES = (new DialogType[] {
                NONE, BACKGROUND_SUCCESS, BACKGROUND_FAILED
            });
        }

        private DialogType(String s, int i)
        {
            super(s, i);
        }
    }

}
