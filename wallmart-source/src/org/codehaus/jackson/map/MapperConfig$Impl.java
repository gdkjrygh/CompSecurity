// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;

import org.codehaus.jackson.map.introspect.VisibilityChecker;
import org.codehaus.jackson.map.jsontype.SubtypeResolver;
import org.codehaus.jackson.map.type.TypeFactory;

// Referenced classes of package org.codehaus.jackson.map:
//            MapperConfig, ClassIntrospector, AnnotationIntrospector, PropertyNamingStrategy, 
//            HandlerInstantiator

static abstract class _featureFlags extends MapperConfig
{

    protected int _featureFlags;

    static int collectFeatureDefaults(Class class1)
    {
        int j = 0;
        class1 = (Enum[])class1.getEnumConstants();
        int l = class1.length;
        for (int i = 0; i < l;)
        {
            Object obj = class1[i];
            int k = j;
            if (((gFeature)obj).enabledByDefault())
            {
                k = j | ((gFeature)obj).getMask();
            }
            i++;
            j = k;
        }

        return j;
    }

    public void disable(gFeature gfeature)
    {
        _featureFlags = _featureFlags & ~gfeature.getMask();
    }

    public void enable(gFeature gfeature)
    {
        _featureFlags = _featureFlags | gfeature.getMask();
    }

    public boolean isEnabled(gFeature gfeature)
    {
        return (_featureFlags & gfeature.getMask()) != 0;
    }

    public void set(gFeature gfeature, boolean flag)
    {
        if (flag)
        {
            enable(gfeature);
            return;
        } else
        {
            disable(gfeature);
            return;
        }
    }

    public transient abstract gFeature with(gFeature agfeature[]);

    public transient abstract gFeature without(gFeature agfeature[]);

    protected r(ClassIntrospector classintrospector, AnnotationIntrospector annotationintrospector, VisibilityChecker visibilitychecker, SubtypeResolver subtyperesolver, PropertyNamingStrategy propertynamingstrategy, TypeFactory typefactory, HandlerInstantiator handlerinstantiator, 
            int i)
    {
        super(classintrospector, annotationintrospector, visibilitychecker, subtyperesolver, propertynamingstrategy, typefactory, handlerinstantiator);
        _featureFlags = i;
    }

    protected _featureFlags(_featureFlags _pfeatureflags)
    {
        super(_pfeatureflags);
        _featureFlags = _pfeatureflags._featureFlags;
    }

    protected _featureFlags(_featureFlags _pfeatureflags, int i)
    {
        super(_pfeatureflags);
        _featureFlags = i;
    }

    protected solver(solver solver, solver solver1, SubtypeResolver subtyperesolver)
    {
        super(solver, solver1, subtyperesolver);
        _featureFlags = solver._featureFlags;
    }
}
