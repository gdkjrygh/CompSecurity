// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser;


// Referenced classes of package org.codehaus.jackson.map.ser:
//            BeanPropertyWriter

public abstract class FilteredBeanPropertyWriter
{

    public FilteredBeanPropertyWriter()
    {
    }

    public static BeanPropertyWriter constructViewBased(BeanPropertyWriter beanpropertywriter, Class aclass[])
    {
    /* block-local class not found */
    class MultiView {}

    /* block-local class not found */
    class SingleView {}

        if (aclass.length == 1)
        {
            return new SingleView(beanpropertywriter, aclass[0]);
        } else
        {
            return new MultiView(beanpropertywriter, aclass);
        }
    }
}
