// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.filter;

import com.vladium.util.WCMatcher;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vladium.emma.filter:
//            IInclExclFilter

private static final class m_exclusions
    implements IInclExclFilter
{

    private final WCMatcher m_exclusions[];
    private final WCMatcher m_inclusions[];

    public boolean included(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        WCMatcher awcmatcher[];
        WCMatcher awcmatcher1[];
        int i;
        boolean flag1;
        int k;
        s = s.toCharArray();
        awcmatcher = m_inclusions;
        awcmatcher1 = m_exclusions;
        if (awcmatcher == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = false;
        i = 0;
        k = awcmatcher.length;
_L4:
        boolean flag;
        flag = flag1;
        if (i >= k)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!awcmatcher[i].matches(s))
        {
            break MISSING_BLOCK_LABEL_103;
        }
        flag = true;
        if (!flag) goto _L1; else goto _L3
_L3:
        if (awcmatcher1 == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        i = 0;
        int j = awcmatcher1.length;
        do
        {
            if (i >= j)
            {
                break MISSING_BLOCK_LABEL_112;
            }
            if (awcmatcher1[i].matches(s))
            {
                continue; /* Loop/switch isn't completed */
            }
            i++;
        } while (true);
        continue; /* Loop/switch isn't completed */
        i++;
          goto _L4
        return true;
        if (true) goto _L1; else goto _L5
_L5:
    }

    (List list, List list1)
    {
        if (list == null || list.isEmpty())
        {
            m_inclusions = null;
        } else
        {
            m_inclusions = new WCMatcher[list.size()];
            int i = 0;
            list = list.iterator();
            while (list.hasNext()) 
            {
                String s = (String)list.next();
                m_inclusions[i] = WCMatcher.compile(s);
                i++;
            }
        }
        if (list1 == null || list1.isEmpty())
        {
            m_exclusions = null;
        } else
        {
            m_exclusions = new WCMatcher[list1.size()];
            int j = 0;
            list = list1.iterator();
            while (list.hasNext()) 
            {
                list1 = (String)list.next();
                m_exclusions[j] = WCMatcher.compile(list1);
                j++;
            }
        }
    }

    m_exclusions(String as[], String as1[])
    {
        if (as == null || as.length == 0)
        {
            m_inclusions = null;
        } else
        {
            m_inclusions = new WCMatcher[as.length];
            int i = 0;
            while (i < as.length) 
            {
                m_inclusions[i] = WCMatcher.compile(as[i]);
                i++;
            }
        }
        if (as1 == null || as1.length == 0)
        {
            m_exclusions = null;
        } else
        {
            m_exclusions = new WCMatcher[as1.length];
            int j = 0;
            while (j < as1.length) 
            {
                m_exclusions[j] = WCMatcher.compile(as1[j]);
                j++;
            }
        }
    }
}
