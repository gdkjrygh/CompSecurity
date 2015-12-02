// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import com.ubercab.client.feature.addressbook.UploadContactsIntentService;

public final class dyq
{

    final UploadContactsIntentService a;
    final UploadContactsIntentService b;

    public dyq(UploadContactsIntentService uploadcontactsintentservice, UploadContactsIntentService uploadcontactsintentservice1)
    {
        b = uploadcontactsintentservice;
        super();
        a = uploadcontactsintentservice1;
    }

    public static dyi a()
    {
        return new dyi();
    }

    protected static hkf a(hjo hjo)
    {
        return hkf.a(hjo);
    }

    final dyo a(dyi dyi1, gmg gmg, hkf hkf1, dal dal1)
    {
        return new dyo(b.getApplication().getApplicationContext(), dal1.z(), dyi1, hkf1, gmg);
    }
}
