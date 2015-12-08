// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package org.apache.commons.io.comparator:
//            AbstractFileComparator

public class CompositeFileComparator extends AbstractFileComparator
    implements Serializable
{

    private static final Comparator NO_COMPARATORS[] = new Comparator[0];
    private final Comparator delegates[];

    public CompositeFileComparator(Iterable iterable)
    {
        if (iterable == null)
        {
            delegates = (Comparator[])NO_COMPARATORS;
            return;
        }
        ArrayList arraylist = new ArrayList();
        for (iterable = iterable.iterator(); iterable.hasNext(); arraylist.add((Comparator)iterable.next())) { }
        delegates = (Comparator[])(Comparator[])arraylist.toArray(new Comparator[arraylist.size()]);
    }

    public transient CompositeFileComparator(Comparator acomparator[])
    {
        if (acomparator == null)
        {
            delegates = (Comparator[])NO_COMPARATORS;
            return;
        } else
        {
            delegates = (Comparator[])new Comparator[acomparator.length];
            System.arraycopy(acomparator, 0, delegates, 0, acomparator.length);
            return;
        }
    }

    public int compare(File file, File file1)
    {
        int i = 0;
        Comparator acomparator[] = delegates;
        int k = acomparator.length;
        int j = 0;
        do
        {
label0:
            {
                if (j < k)
                {
                    i = acomparator[j].compare(file, file1);
                    if (i == 0)
                    {
                        break label0;
                    }
                }
                return i;
            }
            j++;
        } while (true);
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((File)obj, (File)obj1);
    }

    public volatile List sort(List list)
    {
        return super.sort(list);
    }

    public volatile File[] sort(File afile[])
    {
        return super.sort(afile);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(super.toString());
        stringbuilder.append('{');
        for (int i = 0; i < delegates.length; i++)
        {
            if (i > 0)
            {
                stringbuilder.append(',');
            }
            stringbuilder.append(delegates[i]);
        }

        stringbuilder.append('}');
        return stringbuilder.toString();
    }

}
