// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.jsontype;

import java.util.Collection;
import org.codehaus.jackson.map.AnnotationIntrospector;
import org.codehaus.jackson.map.MapperConfig;
import org.codehaus.jackson.map.introspect.AnnotatedClass;
import org.codehaus.jackson.map.introspect.AnnotatedMember;

// Referenced classes of package org.codehaus.jackson.map.jsontype:
//            NamedType

public abstract class SubtypeResolver
{

    public SubtypeResolver()
    {
    }

    public abstract Collection collectAndResolveSubtypes(AnnotatedClass annotatedclass, MapperConfig mapperconfig, AnnotationIntrospector annotationintrospector);

    public abstract Collection collectAndResolveSubtypes(AnnotatedMember annotatedmember, MapperConfig mapperconfig, AnnotationIntrospector annotationintrospector);

    public transient abstract void registerSubtypes(Class aclass[]);

    public transient abstract void registerSubtypes(NamedType anamedtype[]);
}
