// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.internal.lang.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import org.aspectj.lang.annotation.AdviceName;
import org.aspectj.lang.reflect.Advice;
import org.aspectj.lang.reflect.AdviceKind;
import org.aspectj.lang.reflect.AjType;
import org.aspectj.lang.reflect.AjTypeSystem;
import org.aspectj.lang.reflect.PointcutExpression;

// Referenced classes of package org.aspectj.internal.lang.reflect:
//            PointcutExpressionImpl

public class AdviceImpl
    implements Advice
{

    private static final String AJC_INTERNAL = "org.aspectj.runtime.internal";
    private final Method adviceMethod;
    private AjType exceptionTypes[];
    private Type genericParameterTypes[];
    private boolean hasExtraParam;
    private final AdviceKind kind;
    private AjType parameterTypes[];
    private PointcutExpression pointcutExpression;

    protected AdviceImpl(Method method, String s, AdviceKind advicekind)
    {
        hasExtraParam = false;
        kind = advicekind;
        adviceMethod = method;
        pointcutExpression = new PointcutExpressionImpl(s);
    }

    protected AdviceImpl(Method method, String s, AdviceKind advicekind, String s1)
    {
        this(method, s, advicekind);
        hasExtraParam = true;
    }

    public AjType getDeclaringType()
    {
        return AjTypeSystem.getAjType(adviceMethod.getDeclaringClass());
    }

    public AjType[] getExceptionTypes()
    {
        if (exceptionTypes == null)
        {
            Class aclass[] = adviceMethod.getExceptionTypes();
            exceptionTypes = new AjType[aclass.length];
            for (int i = 0; i < aclass.length; i++)
            {
                exceptionTypes[i] = AjTypeSystem.getAjType(aclass[i]);
            }

        }
        return exceptionTypes;
    }

    public Type[] getGenericParameterTypes()
    {
        if (genericParameterTypes == null)
        {
            Type atype[] = adviceMethod.getGenericParameterTypes();
            int k = 0;
            int i1 = atype.length;
            for (int i = 0; i < i1;)
            {
                Type type = atype[i];
                int l = k;
                if (type instanceof Class)
                {
                    l = k;
                    if (((Class)type).getPackage().getName().equals("org.aspectj.runtime.internal"))
                    {
                        l = k + 1;
                    }
                }
                i++;
                k = l;
            }

            genericParameterTypes = new Type[atype.length - k];
            int j = 0;
            while (j < genericParameterTypes.length) 
            {
                if (atype[j] instanceof Class)
                {
                    genericParameterTypes[j] = AjTypeSystem.getAjType((Class)atype[j]);
                } else
                {
                    genericParameterTypes[j] = atype[j];
                }
                j++;
            }
        }
        return genericParameterTypes;
    }

    public AdviceKind getKind()
    {
        return kind;
    }

    public String getName()
    {
        String s1 = adviceMethod.getName();
        String s = s1;
        if (s1.startsWith("ajc$"))
        {
            s = "";
            AdviceName advicename = (AdviceName)adviceMethod.getAnnotation(org/aspectj/lang/annotation/AdviceName);
            if (advicename != null)
            {
                s = advicename.value();
            }
        }
        return s;
    }

    public AjType[] getParameterTypes()
    {
        if (parameterTypes == null)
        {
            Class aclass[] = adviceMethod.getParameterTypes();
            int k = 0;
            int i1 = aclass.length;
            for (int i = 0; i < i1;)
            {
                int l = k;
                if (aclass[i].getPackage().getName().equals("org.aspectj.runtime.internal"))
                {
                    l = k + 1;
                }
                i++;
                k = l;
            }

            parameterTypes = new AjType[aclass.length - k];
            for (int j = 0; j < parameterTypes.length; j++)
            {
                parameterTypes[j] = AjTypeSystem.getAjType(aclass[j]);
            }

        }
        return parameterTypes;
    }

    public PointcutExpression getPointcutExpression()
    {
        return pointcutExpression;
    }

    public String toString()
    {
        StringBuffer stringbuffer;
        stringbuffer = new StringBuffer();
        if (getName().length() > 0)
        {
            stringbuffer.append("@AdviceName(\"");
            stringbuffer.append(getName());
            stringbuffer.append("\") ");
        }
        if (getKind() == AdviceKind.AROUND)
        {
            stringbuffer.append(adviceMethod.getGenericReturnType().toString());
            stringbuffer.append(" ");
        }
        static class _cls1
        {

            static final int $SwitchMap$org$aspectj$lang$reflect$AdviceKind[];

            static 
            {
                $SwitchMap$org$aspectj$lang$reflect$AdviceKind = new int[AdviceKind.values().length];
                try
                {
                    $SwitchMap$org$aspectj$lang$reflect$AdviceKind[AdviceKind.AFTER.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$org$aspectj$lang$reflect$AdviceKind[AdviceKind.AFTER_RETURNING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$org$aspectj$lang$reflect$AdviceKind[AdviceKind.AFTER_THROWING.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$org$aspectj$lang$reflect$AdviceKind[AdviceKind.AROUND.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$org$aspectj$lang$reflect$AdviceKind[AdviceKind.BEFORE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.org.aspectj.lang.reflect.AdviceKind[getKind().ordinal()];
        JVM INSTR tableswitch 1 5: default 120
    //                   1 191
    //                   2 201
    //                   3 211
    //                   4 221
    //                   5 231;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        AjType aajtype[];
        int i;
        aajtype = getParameterTypes();
        int j = aajtype.length;
        i = j;
        if (hasExtraParam)
        {
            i = j - 1;
        }
        for (int k = 0; k < i; k++)
        {
            stringbuffer.append(aajtype[k].getName());
            if (k + 1 < i)
            {
                stringbuffer.append(",");
            }
        }

        break; /* Loop/switch isn't completed */
_L2:
        stringbuffer.append("after(");
        continue; /* Loop/switch isn't completed */
_L3:
        stringbuffer.append("after(");
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuffer.append("after(");
        continue; /* Loop/switch isn't completed */
_L5:
        stringbuffer.append("around(");
        continue; /* Loop/switch isn't completed */
_L6:
        stringbuffer.append("before(");
        if (true) goto _L1; else goto _L7
_L7:
        stringbuffer.append(") ");
        _cls1..SwitchMap.org.aspectj.lang.reflect.AdviceKind[getKind().ordinal()];
        JVM INSTR tableswitch 2 3: default 280
    //                   2 340
    //                   3 383;
           goto _L8 _L9 _L10
_L9:
        stringbuffer.append("returning");
        if (hasExtraParam)
        {
            stringbuffer.append("(");
            stringbuffer.append(aajtype[i - 1].getName());
            stringbuffer.append(") ");
        }
_L10:
        stringbuffer.append("throwing");
        if (hasExtraParam)
        {
            stringbuffer.append("(");
            stringbuffer.append(aajtype[i - 1].getName());
            stringbuffer.append(") ");
        }
_L8:
        aajtype = getExceptionTypes();
        if (aajtype.length > 0)
        {
            stringbuffer.append("throws ");
            for (i = 0; i < aajtype.length; i++)
            {
                stringbuffer.append(aajtype[i].getName());
                if (i + 1 < aajtype.length)
                {
                    stringbuffer.append(",");
                }
            }

            stringbuffer.append(" ");
        }
        stringbuffer.append(": ");
        stringbuffer.append(getPointcutExpression().asString());
        return stringbuffer.toString();
    }
}
