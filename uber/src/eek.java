// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eek extends Enum
{

    public static final eek a;
    public static final eek b;
    public static final eek c;
    public static final eek d;
    public static final eek e;
    public static final eek f;
    public static final eek g;
    public static final eek h;
    public static final eek i;
    public static final eek j;
    public static final eek k;
    public static final eek l;
    private static final eek n[];
    private final String m;

    private eek(String s, int i1, String s1)
    {
        super(s, i1);
        m = s1;
    }

    public static eek valueOf(String s)
    {
        return (eek)Enum.valueOf(eek, s);
    }

    public static eek[] values()
    {
        return (eek[])n.clone();
    }

    static 
    {
        a = new eek("CANCELED", 0, "canceled");
        b = new eek("DEFAULT", 1, "default");
        c = new eek("DOUBLE_TAP", 2, "double_tap");
        d = new eek("DOUBLE_TAP_AND_DRAG_DOWN", 3, "double_tap_and_drag_down");
        e = new eek("DOUBLE_TAP_AND_DRAG_END", 4, "double_tap_and_drag_end");
        f = new eek("DOUBLE_TAP_AND_DRAG_HORIZONTAL", 5, "double_tap_and_drag_horizontal");
        g = new eek("DOUBLE_TAP_AND_DRAG_UP", 6, "double_tap_and_drag_up");
        h = new eek("PINCH_ZOOM_ACTIVE", 7, "pinch_zoom_active");
        i = new eek("PINCH_ZOOM_END", 8, "pinch_zoom_end");
        j = new eek("PINCH_ZOOM_START", 9, "pinch_zoom_start");
        k = new eek("TAP", 10, "tap");
        l = new eek("TWO_FINGER_TAP", 11, "two_finger_tap");
        n = (new eek[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l
        });
    }
}
