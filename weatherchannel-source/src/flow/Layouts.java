// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package flow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

// Referenced classes of package flow:
//            Layout

public final class Layouts
{

    private Layouts()
    {
    }

    public static View createView(Context context, Class class1)
    {
        Layout layout = (Layout)class1.getAnnotation(flow/Layout);
        if (layout == null)
        {
            throw new IllegalArgumentException(String.format("@%s annotation not found on class %s", new Object[] {
                flow/Layout.getSimpleName(), class1.getName()
            }));
        } else
        {
            return inflateLayout(context, layout.value());
        }
    }

    public static View createView(Context context, Object obj)
    {
        return createView(context, obj.getClass());
    }

    private static View inflateLayout(Context context, int i)
    {
        return LayoutInflater.from(context).inflate(i, null);
    }
}
