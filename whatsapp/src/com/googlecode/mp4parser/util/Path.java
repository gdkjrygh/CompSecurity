// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.util;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.AbstractContainerBox;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Path
{

    static final boolean $assertionsDisabled;
    static Pattern component = Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");

    private Path()
    {
    }

    public static String createPath(Box box)
    {
        return createPath(box, "");
    }

    private static String createPath(Box box, String s)
    {
        Container container;
        Iterator iterator;
        int i;
        container = box.getParent();
        i = 0;
        iterator = container.getBoxes().iterator();
_L5:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        s = (new StringBuilder(String.valueOf(String.format("/%s[%d]", new Object[] {
            box.getType(), Integer.valueOf(i)
        })))).append(s).toString();
        box = s;
        if (container instanceof Box)
        {
            box = createPath((Box)container, s);
        }
        return box;
_L2:
        Box box1;
        box1 = (Box)iterator.next();
        if (!box1.getType().equals(box.getType()))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (box1 == box) goto _L1; else goto _L3
_L3:
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static Box getPath(Box box, String s)
    {
        box = getPaths(box, s, true);
        if (box.isEmpty())
        {
            return null;
        } else
        {
            return (Box)box.get(0);
        }
    }

    public static Box getPath(Container container, String s)
    {
        container = getPaths(container, s, true);
        if (container.isEmpty())
        {
            return null;
        } else
        {
            return (Box)container.get(0);
        }
    }

    public static Box getPath(AbstractContainerBox abstractcontainerbox, String s)
    {
        abstractcontainerbox = getPaths(abstractcontainerbox, s, true);
        if (abstractcontainerbox.isEmpty())
        {
            return null;
        } else
        {
            return (Box)abstractcontainerbox.get(0);
        }
    }

    public static List getPaths(Box box, String s)
    {
        return getPaths(box, s, false);
    }

    private static List getPaths(Box box, String s, boolean flag)
    {
        return getPaths(box, s, flag);
    }

    public static List getPaths(Container container, String s)
    {
        return getPaths(container, s, false);
    }

    private static List getPaths(Container container, String s, boolean flag)
    {
        return getPaths(container, s, flag);
    }

    public static List getPaths(AbstractContainerBox abstractcontainerbox, String s)
    {
        return getPaths(abstractcontainerbox, s, false);
    }

    private static List getPaths(AbstractContainerBox abstractcontainerbox, String s, boolean flag)
    {
        return getPaths(abstractcontainerbox, s, flag);
    }

    private static List getPaths(Object obj, String s, boolean flag)
    {
        if (!s.startsWith("/")) goto _L2; else goto _L1
_L1:
        s = s.substring(1);
_L14:
        if (obj instanceof Box) goto _L3; else goto _L2
_L2:
        if (s.length() != 0) goto _L5; else goto _L4
_L4:
        if (!(obj instanceof Box)) goto _L7; else goto _L6
_L6:
        obj = Collections.singletonList((Box)obj);
_L9:
        return ((List) (obj));
_L3:
        obj = ((Box)obj).getParent();
        continue; /* Loop/switch isn't completed */
_L7:
        throw new RuntimeException("Result of path expression seems to be the root container. This is not allowed!");
_L5:
        Object obj1;
        String s2;
        Object obj2;
        int i;
        int j;
        if (s.contains("/"))
        {
            String s1 = s.substring(s.indexOf('/') + 1);
            obj1 = s.substring(0, s.indexOf('/'));
            s = s1;
        } else
        {
            obj1 = s;
            s = "";
        }
        obj2 = component.matcher(((CharSequence) (obj1)));
        if (!((Matcher) (obj2)).matches())
        {
            break MISSING_BLOCK_LABEL_338;
        }
        s2 = ((Matcher) (obj2)).group(1);
        if ("..".equals(s2))
        {
            if (obj instanceof Box)
            {
                return getPaths(((Box)obj).getParent(), s, flag);
            } else
            {
                return Collections.emptyList();
            }
        }
        if (!(obj instanceof Container))
        {
            break MISSING_BLOCK_LABEL_334;
        }
        i = -1;
        if (((Matcher) (obj2)).group(2) != null)
        {
            i = Integer.parseInt(((Matcher) (obj2)).group(3));
        }
        obj1 = new LinkedList();
        j = 0;
        obj2 = ((Container)obj).getBoxes().iterator();
_L11:
        obj = obj1;
        if (!((Iterator) (obj2)).hasNext()) goto _L9; else goto _L8
_L8:
        int k;
        obj = (Box)((Iterator) (obj2)).next();
        k = j;
        if (((Box) (obj)).getType().matches(s2))
        {
            if (i == -1 || i == j)
            {
                ((List) (obj1)).addAll(getPaths(((Box) (obj)), s, flag));
            }
            k = j + 1;
        }
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        j = k;
        if (i < 0) goto _L11; else goto _L10
_L10:
        j = k;
        if (((List) (obj1)).isEmpty()) goto _L11; else goto _L12
_L12:
        return ((List) (obj1));
        return Collections.emptyList();
        throw new RuntimeException((new StringBuilder(String.valueOf(obj1))).append(" is invalid path.").toString());
        if (true) goto _L14; else goto _L13
_L13:
    }

    public static boolean isContained(Box box, String s)
    {
        if (!$assertionsDisabled && !s.startsWith("/"))
        {
            throw new AssertionError("Absolute path required");
        } else
        {
            return getPaths(box, s).contains(box);
        }
    }

    static 
    {
        boolean flag;
        if (!com/googlecode/mp4parser/util/Path.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
