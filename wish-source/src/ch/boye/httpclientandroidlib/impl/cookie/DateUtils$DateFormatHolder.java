// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.cookie;

import java.lang.ref.SoftReference;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.cookie:
//            DateUtils

static final class _cls1
{

    private static final ThreadLocal THREADLOCAL_FORMATS = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected SoftReference initialValue()
        {
            return new SoftReference(new HashMap());
        }

    };

    public static SimpleDateFormat formatFor(String s)
    {
        Object obj1 = (Map)((SoftReference)THREADLOCAL_FORMATS.get()).get();
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = new HashMap();
            THREADLOCAL_FORMATS.set(new SoftReference(obj));
        }
        SimpleDateFormat simpledateformat = (SimpleDateFormat)((Map) (obj)).get(s);
        obj1 = simpledateformat;
        if (simpledateformat == null)
        {
            obj1 = new SimpleDateFormat(s, Locale.US);
            ((SimpleDateFormat) (obj1)).setTimeZone(TimeZone.getTimeZone("GMT"));
            ((Map) (obj)).put(s, obj1);
        }
        return ((SimpleDateFormat) (obj1));
    }


    _cls1()
    {
    }
}
