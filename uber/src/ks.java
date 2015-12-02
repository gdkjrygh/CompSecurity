// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

public final class ks extends aak
{

    public ks()
    {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    private lf b(Context context, AdSizeParcel adsizeparcel, String s, aei aei)
    {
        try
        {
            aaf aaf = aai.a(context);
            context = lg.a(((li)a(context)).a(aaf, adsizeparcel, s, aei, 0x6fcd18));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            of.d("Could not create remote AdManager.", context);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            of.d("Could not create remote AdManager.", context);
            return null;
        }
        return context;
    }

    private static li b(IBinder ibinder)
    {
        return lj.a(ibinder);
    }

    protected final Object a(IBinder ibinder)
    {
        return b(ibinder);
    }

    public final lf a(Context context, AdSizeParcel adsizeparcel, String s, aei aei)
    {
        Object obj;
label0:
        {
            kx.a();
            if (oe.b(context))
            {
                lf lf = b(context, adsizeparcel, s, aei);
                obj = lf;
                if (lf != null)
                {
                    break label0;
                }
            }
            of.a("Using AdManager from the client jar.");
            obj = new oh(context, adsizeparcel, s, aei, new VersionInfoParcel());
        }
        return ((lf) (obj));
    }
}
