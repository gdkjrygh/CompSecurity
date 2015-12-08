// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            AdapterHelper

static class itemCount
{

    static final int ADD = 0;
    static final int MOVE = 3;
    static final int POOL_SIZE = 30;
    static final int REMOVE = 1;
    static final int UPDATE = 2;
    int cmd;
    int itemCount;
    int positionStart;

    String cmdToString()
    {
        switch (cmd)
        {
        default:
            return "??";

        case 0: // '\0'
            return "add";

        case 1: // '\001'
            return "rm";

        case 2: // '\002'
            return "up";

        case 3: // '\003'
            return "mv";
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (cmd)obj;
            if (cmd != ((cmd) (obj)).cmd)
            {
                return false;
            }
            if (cmd != 3 || Math.abs(itemCount - positionStart) != 1 || itemCount != ((itemCount) (obj)).positionStart || positionStart != ((positionStart) (obj)).itemCount)
            {
                if (itemCount != ((itemCount) (obj)).itemCount)
                {
                    return false;
                }
                if (positionStart != ((positionStart) (obj)).positionStart)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public int hashCode()
    {
        return (cmd * 31 + positionStart) * 31 + itemCount;
    }

    public String toString()
    {
        return (new StringBuilder()).append("[").append(cmdToString()).append(",s:").append(positionStart).append("c:").append(itemCount).append("]").toString();
    }

    (int i, int j, int k)
    {
        cmd = i;
        positionStart = j;
        itemCount = k;
    }
}
