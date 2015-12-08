// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            GridLayout

static final class value
{

    public final rval span;
    public boolean valid;
    public final bleInt value;

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(span).append(" ");
        String s;
        if (!valid)
        {
            s = "+>";
        } else
        {
            s = "->";
        }
        return stringbuilder.append(s).append(" ").append(value).toString();
    }

    public bleInt(rval rval, bleInt bleint)
    {
        valid = true;
        span = rval;
        value = bleint;
    }
}
