// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.youtube.player.internal.b.d;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            az

final class ba
    implements android.view.LayoutInflater.Factory
{

    private final ClassLoader a;

    public ba(ClassLoader classloader)
    {
        a = (ClassLoader)d.a(classloader, "remoteClassLoader cannot be null");
    }

    public final View onCreateView(String s, Context context, AttributeSet attributeset)
    {
        try
        {
            s = (View)a.loadClass(s).asSubclass(android/view/View).getConstructor(az.a()).newInstance(new Object[] {
                context, attributeset
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }
}
