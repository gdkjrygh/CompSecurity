// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.ubercab.client.core.app.RiderActivity;

public class cyn extends dtp
{

    public cyn()
    {
        setCancelable(false);
    }

    public static void a(RiderActivity rideractivity, String s, String s1, String s2)
    {
        s = a(s, s1, 2100);
        s.putString("dialog.button_positive_text", s2);
        s1 = new cyn();
        s1.setArguments(s);
        s1.show(rideractivity.getSupportFragmentManager(), s1.getClass().getName());
    }
}
