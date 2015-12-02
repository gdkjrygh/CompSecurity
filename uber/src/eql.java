// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.SimpleAdapter;
import java.util.List;
import java.util.Map;

public final class eql extends SimpleAdapter
{

    public static final List a = gke.a("personal", "business");

    public eql(Context context)
    {
        super(context, a(context), 0x1090008, new String[] {
            "label"
        }, new int[] {
            0x1020014
        });
        setDropDownViewResource(0x1090009);
    }

    private static List a(Context context)
    {
        String s = context.getString(0x7f070350);
        context = context.getString(0x7f070075);
        return gke.a(gkg.a("value", "personal", "label", s), gkg.a("value", "business", "label", context));
    }

    private Map b(int i)
    {
        return (Map)super.getItem(i);
    }

    public final String a(int i)
    {
        return (String)b(i).get("value");
    }

    public final Object getItem(int i)
    {
        return b(i);
    }

}
