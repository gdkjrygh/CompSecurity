// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import java.lang.reflect.Field;

// Referenced classes of package com.google.android.gms.dynamic:
//            zzd

public final class zze extends zzd.zza
{

    private final Object mWrappedObject;

    private zze(Object obj)
    {
        mWrappedObject = obj;
    }

    public static Object zzp(zzd zzd1)
    {
        if (zzd1 instanceof zze)
        {
            return ((zze)zzd1).mWrappedObject;
        }
        zzd1 = zzd1.asBinder();
        Field afield[] = zzd1.getClass().getDeclaredFields();
        if (afield.length == 1)
        {
            Field field = afield[0];
            if (!field.isAccessible())
            {
                field.setAccessible(true);
                try
                {
                    zzd1 = ((zzd) (field.get(zzd1)));
                }
                // Misplaced declaration of an exception variable
                catch (zzd zzd1)
                {
                    throw new IllegalArgumentException("Binder object is null.", zzd1);
                }
                // Misplaced declaration of an exception variable
                catch (zzd zzd1)
                {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", zzd1);
                }
                // Misplaced declaration of an exception variable
                catch (zzd zzd1)
                {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", zzd1);
                }
                return zzd1;
            } else
            {
                throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
            }
        } else
        {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
    }

    public static zzd zzx(Object obj)
    {
        return new zze(obj);
    }
}
