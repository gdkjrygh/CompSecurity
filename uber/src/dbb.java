// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Pair;
import com.ubercab.network.uspout.UspoutClient;
import com.ubercab.network.uspout.model.Message;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class dbb
    implements gmm
{

    private UspoutClient a;

    public dbb(UspoutClient uspoutclient)
    {
        a = uspoutclient;
    }

    public final void a(gmv gmv1, String s, gmj gmj1, gmh gmh1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("type", "experiment");
        hashmap.put("name", gmv1.name().toLowerCase(Locale.US));
        hashmap.put("group", s);
        if (gmh1 == null)
        {
            gmv1 = null;
        } else
        {
            gmv1 = gmh1.a();
        }
        hashmap.put("segment_uuid", gmv1);
        gmv1 = gmj1.b();
        if (gmv1 != null)
        {
            gmv1 = Message.create(hashmap, System.currentTimeMillis(), (Double)((Pair) (gmv1)).first, (Double)((Pair) (gmv1)).second);
        } else
        {
            gmv1 = Message.create(hashmap);
        }
        a.a(new Message[] {
            gmv1
        });
    }
}
