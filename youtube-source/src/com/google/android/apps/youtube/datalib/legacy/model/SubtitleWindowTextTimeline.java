// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.util.Pair;
import com.google.android.apps.youtube.common.fromguava.c;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            ak

public final class SubtitleWindowTextTimeline
    implements Serializable
{

    final List endTimes;
    private final List lines;
    final List startTimes;

    private SubtitleWindowTextTimeline(List list, List list1, List list2)
    {
        boolean flag1 = true;
        super();
        c.a(list);
        c.a(list1);
        c.a(list2);
        boolean flag;
        if (list.size() == list1.size())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.b(flag, "startTimes and endTimes differ in size");
        if (list.size() == list2.size())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        c.b(flag, "startTimes and lines differ in size");
        startTimes = Collections.unmodifiableList(list);
        endTimes = Collections.unmodifiableList(list1);
        lines = Collections.unmodifiableList(list2);
    }

    SubtitleWindowTextTimeline(List list, List list1, List list2, ak ak)
    {
        this(list, list1, list2);
    }

    private int getIndexForTextAt(int i, boolean flag)
    {
        int j;
        int k;
        k = Collections.binarySearch(startTimes, Integer.valueOf(i));
        j = k;
        if (k >= 0) goto _L2; else goto _L1
_L1:
        j = -k - 2;
        if (j < 0 || i >= ((Integer)endTimes.get(j)).intValue()) goto _L3; else goto _L2
_L2:
        int l;
        if (flag)
        {
            k = j - 1;
        } else
        {
            k = j + 1;
        }
        l = k;
        k = j;
        j = l;
_L9:
        l = k;
        if (j >= startTimes.size()) goto _L5; else goto _L4
_L4:
        l = k;
        if (j < 0) goto _L5; else goto _L6
_L6:
        l = k;
        if (((Integer)startTimes.get(j)).intValue() > i) goto _L5; else goto _L7
_L7:
        l = k;
        if (((Integer)endTimes.get(j)).intValue() <= i) goto _L5; else goto _L8
_L8:
        if (flag)
        {
            k = j - 1;
        } else
        {
            k = j + 1;
        }
        l = j;
        j = k;
        k = l;
        if (true) goto _L9; else goto _L5
_L3:
        l = -1;
_L5:
        return l;
    }

    public final Pair getRollUpTextAt(int i)
    {
        int j = getIndexForTextAt(i, true);
        if (j == -1)
        {
            return new Pair(null, null);
        }
        StringBuilder stringbuilder = new StringBuilder();
        StringBuilder stringbuilder1 = new StringBuilder();
        for (; j + 1 < startTimes.size() && ((Integer)startTimes.get(j + 1)).intValue() <= i && ((Integer)endTimes.get(j + 1)).intValue() > i; j++)
        {
            String s = (String)lines.get(j);
            if (s.endsWith("<br/>"))
            {
                stringbuilder.append(s);
                stringbuilder1.append(s);
            }
        }

        stringbuilder.append((String)lines.get(j));
        i = ((Integer)endTimes.get(j)).intValue();
        do
        {
label0:
            {
                if (j < startTimes.size() && ((Integer)endTimes.get(j)).intValue() == i)
                {
                    String s1 = (String)lines.get(j);
                    if (!s1.endsWith("<br/>") && j + 1 < startTimes.size() && ((Integer)endTimes.get(j + 1)).intValue() <= i)
                    {
                        break label0;
                    }
                    stringbuilder1.append(s1);
                }
                return new Pair(stringbuilder.toString(), stringbuilder1.toString());
            }
            j++;
        } while (true);
    }

    public final Pair getTextAt(int i)
    {
        i = getIndexForTextAt(i, false);
        if (i == -1)
        {
            return new Pair(null, null);
        }
        String s = (String)lines.get(i);
        for (int j = ((Integer)endTimes.get(i)).intValue(); i + 1 < startTimes.size() && ((Integer)endTimes.get(i + 1)).intValue() == j; i++) { }
        return new Pair(s, (String)lines.get(i));
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < startTimes.size(); i++)
        {
            stringbuilder.append("[").append(startTimes.get(i)).append(" - ").append(endTimes.get(i)).append(": ").append((String)lines.get(i)).append("]");
        }

        return stringbuilder.toString();
    }
}
