// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.protocol;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UriPatternMatcher
{

    private final Map map = new HashMap();

    public UriPatternMatcher()
    {
    }

    public Map getObjects()
    {
        this;
        JVM INSTR monitorenter ;
        Map map1 = map;
        this;
        JVM INSTR monitorexit ;
        return map1;
        Exception exception;
        exception;
        throw exception;
    }

    public Object lookup(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new IllegalArgumentException("Request URI may not be null");
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        int i = s.indexOf("?");
        String s1;
        s1 = s;
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        s1 = s.substring(0, i);
        s = ((String) (map.get(s1)));
        String s3 = s;
        if (s != null) goto _L2; else goto _L1
_L1:
        String s2 = null;
        Iterator iterator = map.keySet().iterator();
_L3:
        s3 = s;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s3 = (String)iterator.next();
        if (!matchUriRequestPattern(s3, s1))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        if (s2.length() >= s3.length() && (s2.length() != s3.length() || !s3.endsWith("*")))
        {
            continue; /* Loop/switch isn't completed */
        }
        s = ((String) (map.get(s3)));
        s2 = s3;
        if (true) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return s3;
    }

    protected boolean matchUriRequestPattern(String s, String s1)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            if (s.equals("*"))
            {
                return true;
            }
            if (!s.endsWith("*") || !s1.startsWith(s.substring(0, s.length() - 1)))
            {
                flag = flag1;
                if (!s.startsWith("*"))
                {
                    break label0;
                }
                flag = flag1;
                if (!s1.endsWith(s.substring(1, s.length())))
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public void register(String s, Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new IllegalArgumentException("URI request pattern may not be null");
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        map.put(s, obj);
        this;
        JVM INSTR monitorexit ;
    }

    public void setHandlers(Map map1)
    {
        this;
        JVM INSTR monitorenter ;
        if (map1 != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new IllegalArgumentException("Map of handlers may not be null");
        map1;
        this;
        JVM INSTR monitorexit ;
        throw map1;
        map.clear();
        map.putAll(map1);
        this;
        JVM INSTR monitorexit ;
    }

    public void setObjects(Map map1)
    {
        this;
        JVM INSTR monitorenter ;
        if (map1 != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new IllegalArgumentException("Map of handlers may not be null");
        map1;
        this;
        JVM INSTR monitorexit ;
        throw map1;
        map.clear();
        map.putAll(map1);
        this;
        JVM INSTR monitorexit ;
    }

    public void unregister(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (s != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        map.remove(s);
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }
}
