// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.data;

import com.vladium.util.IProperties;
import com.vladium.util.Property;
import java.util.Properties;

// Referenced classes of package com.vladium.emma.data:
//            CoverageOptions

public abstract class CoverageOptionsFactory
{

    private CoverageOptionsFactory()
    {
    }

    public static CoverageOptions create(IProperties iproperties)
    {
        return new CoverageOptions(Property.toBoolean(iproperties.getProperty("instr.exclude_synthetic_methods", "true")), Property.toBoolean(iproperties.getProperty("instr.exclude_bridge_methods", "true")), Property.toBoolean(iproperties.getProperty("instr.do_suid_compensation", "true")));
    }

    public static CoverageOptions create(Properties properties)
    {
        return new CoverageOptions(Property.toBoolean(properties.getProperty("instr.exclude_synthetic_methods", "true")), Property.toBoolean(properties.getProperty("instr.exclude_bridge_methods", "true")), Property.toBoolean(properties.getProperty("instr.do_suid_compensation", "true")));
    }
}
