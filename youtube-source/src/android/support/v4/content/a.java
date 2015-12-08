// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class a
{

    public static boolean a(Context context, Intent aintent[], Bundle bundle)
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 16)
        {
            context.startActivities(aintent, bundle);
            return true;
        }
        if (i >= 11)
        {
            context.startActivities(aintent);
            return true;
        } else
        {
            return false;
        }
    }
}
