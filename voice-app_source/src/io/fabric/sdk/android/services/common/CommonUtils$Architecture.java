// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import android.os.Build;
import android.text.TextUtils;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            CommonUtils

static final class  extends Enum
{

    private static final X86_32 $VALUES[];
    public static final X86_32 ARM64;
    public static final X86_32 ARMV6;
    public static final X86_32 ARMV7;
    public static final X86_32 ARMV7S;
    public static final X86_32 ARM_UNKNOWN;
    public static final X86_32 PPC;
    public static final X86_32 PPC64;
    public static final X86_32 UNKNOWN;
    public static final X86_32 X86_32;
    public static final X86_32 X86_64;
    private static final Map matcher;

    static  getValue()
    {
        Object obj = Build.CPU_ABI;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            Fabric.getLogger().d("Fabric", "Architecture#getValue()::Build.CPU_ABI returned null or empty");
            obj = UNKNOWN;
        } else
        {
            obj = ((String) (obj)).toLowerCase(Locale.US);
              = (UNKNOWN)matcher.get(obj);
            obj = ;
            if ( == null)
            {
                return UNKNOWN;
            }
        }
        return ((UNKNOWN) (obj));
    }

    public static UNKNOWN valueOf(String s)
    {
        return (UNKNOWN)Enum.valueOf(io/fabric/sdk/android/services/common/CommonUtils$Architecture, s);
    }

    public static UNKNOWN[] values()
    {
        return (UNKNOWN[])$VALUES.clone();
    }

    static 
    {
        X86_32 = new <init>("X86_32", 0);
        X86_64 = new <init>("X86_64", 1);
        ARM_UNKNOWN = new <init>("ARM_UNKNOWN", 2);
        PPC = new <init>("PPC", 3);
        PPC64 = new <init>("PPC64", 4);
        ARMV6 = new <init>("ARMV6", 5);
        ARMV7 = new <init>("ARMV7", 6);
        UNKNOWN = new <init>("UNKNOWN", 7);
        ARMV7S = new <init>("ARMV7S", 8);
        ARM64 = new <init>("ARM64", 9);
        $VALUES = (new .VALUES[] {
            X86_32, X86_64, ARM_UNKNOWN, PPC, PPC64, ARMV6, ARMV7, UNKNOWN, ARMV7S, ARM64
        });
        matcher = new HashMap(4);
        matcher.put("armeabi-v7a", ARMV7);
        matcher.put("armeabi", ARMV6);
        matcher.put("x86", X86_32);
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
