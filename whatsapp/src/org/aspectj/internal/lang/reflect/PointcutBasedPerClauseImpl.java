// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.PerClauseKind;
import org.aspectj.lang.reflect.PointcutBasedPerClause;
import org.aspectj.lang.reflect.PointcutExpression;

// Referenced classes of package org.aspectj.internal.lang.reflect:
//            PerClauseImpl, PointcutExpressionImpl

public class PointcutBasedPerClauseImpl extends PerClauseImpl
    implements PointcutBasedPerClause
{

    private final PointcutExpression pointcutExpression;

    public PointcutBasedPerClauseImpl(PerClauseKind perclausekind, String s)
    {
        super(perclausekind);
        pointcutExpression = new PointcutExpressionImpl(s);
    }

    public PointcutExpression getPointcutExpression()
    {
        return pointcutExpression;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        static class _cls1
        {

            static final int $SwitchMap$org$aspectj$lang$reflect$PerClauseKind[];

            static 
            {
                $SwitchMap$org$aspectj$lang$reflect$PerClauseKind = new int[PerClauseKind.values().length];
                try
                {
                    $SwitchMap$org$aspectj$lang$reflect$PerClauseKind[PerClauseKind.PERCFLOW.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$org$aspectj$lang$reflect$PerClauseKind[PerClauseKind.PERCFLOWBELOW.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$org$aspectj$lang$reflect$PerClauseKind[PerClauseKind.PERTARGET.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$org$aspectj$lang$reflect$PerClauseKind[PerClauseKind.PERTHIS.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.org.aspectj.lang.reflect.PerClauseKind[getKind().ordinal()];
        JVM INSTR tableswitch 1 4: default 48
    //                   1 74
    //                   2 84
    //                   3 94
    //                   4 104;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        stringbuffer.append(pointcutExpression.asString());
        stringbuffer.append(")");
        return stringbuffer.toString();
_L2:
        stringbuffer.append("percflow(");
        continue; /* Loop/switch isn't completed */
_L3:
        stringbuffer.append("percflowbelow(");
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuffer.append("pertarget(");
        continue; /* Loop/switch isn't completed */
_L5:
        stringbuffer.append("perthis(");
        if (true) goto _L1; else goto _L6
_L6:
    }
}
