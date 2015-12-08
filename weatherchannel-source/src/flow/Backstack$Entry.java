// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package flow;


// Referenced classes of package flow:
//            Backstack

public static final class <init>
{

    private final long id;
    private final Object screen;

    public long getId()
    {
        return id;
    }

    public Object getScreen()
    {
        return screen;
    }

    public String toString()
    {
        return (new StringBuilder()).append("{").append(id).append(", ").append(screen).append("}").toString();
    }


    private er(long l, Object obj)
    {
        id = l;
        screen = obj;
    }

    screen(long l, Object obj, screen screen1)
    {
        this(l, obj);
    }
}
