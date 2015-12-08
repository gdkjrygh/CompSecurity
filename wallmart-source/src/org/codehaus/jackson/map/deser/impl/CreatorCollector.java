// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.impl;

import java.lang.reflect.Member;
import java.util.HashMap;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.deser.ValueInstantiator;
import org.codehaus.jackson.map.deser.std.StdValueInstantiator;
import org.codehaus.jackson.map.introspect.AnnotatedConstructor;
import org.codehaus.jackson.map.introspect.AnnotatedWithParams;
import org.codehaus.jackson.map.introspect.BasicBeanDescription;
import org.codehaus.jackson.map.type.TypeBindings;
import org.codehaus.jackson.map.util.ClassUtil;

// Referenced classes of package org.codehaus.jackson.map.deser.impl:
//            CreatorProperty

public class CreatorCollector
{

    final BasicBeanDescription _beanDesc;
    protected AnnotatedWithParams _booleanCreator;
    final boolean _canFixAccess;
    protected AnnotatedConstructor _defaultConstructor;
    protected AnnotatedWithParams _delegateCreator;
    protected AnnotatedWithParams _doubleCreator;
    protected AnnotatedWithParams _intCreator;
    protected AnnotatedWithParams _longCreator;
    protected CreatorProperty _propertyBasedArgs[];
    protected AnnotatedWithParams _propertyBasedCreator;
    protected AnnotatedWithParams _stringCreator;

    public CreatorCollector(BasicBeanDescription basicbeandescription, boolean flag)
    {
        _propertyBasedArgs = null;
        _beanDesc = basicbeandescription;
        _canFixAccess = flag;
    }

    public void addBooleanCreator(AnnotatedWithParams annotatedwithparams)
    {
        _booleanCreator = verifyNonDup(annotatedwithparams, _booleanCreator, "boolean");
    }

    public void addDelegatingCreator(AnnotatedWithParams annotatedwithparams)
    {
        _delegateCreator = verifyNonDup(annotatedwithparams, _delegateCreator, "delegate");
    }

    public void addDoubleCreator(AnnotatedWithParams annotatedwithparams)
    {
        _doubleCreator = verifyNonDup(annotatedwithparams, _doubleCreator, "double");
    }

    public void addIntCreator(AnnotatedWithParams annotatedwithparams)
    {
        _intCreator = verifyNonDup(annotatedwithparams, _intCreator, "int");
    }

    public void addLongCreator(AnnotatedWithParams annotatedwithparams)
    {
        _longCreator = verifyNonDup(annotatedwithparams, _longCreator, "long");
    }

    public void addPropertyCreator(AnnotatedWithParams annotatedwithparams, CreatorProperty acreatorproperty[])
    {
        int i;
        int j;
        _propertyBasedCreator = verifyNonDup(annotatedwithparams, _propertyBasedCreator, "property-based");
        if (acreatorproperty.length <= 1)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        annotatedwithparams = new HashMap();
        i = 0;
        j = acreatorproperty.length;
_L2:
        String s;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        s = acreatorproperty[i].getName();
        if (s.length() != 0 || acreatorproperty[i].getInjectableValueId() == null)
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        i++;
        Integer integer;
        if (true) goto _L2; else goto _L1
_L1:
        if ((integer = (Integer)annotatedwithparams.put(s, Integer.valueOf(i))) == null) goto _L4; else goto _L3
_L3:
        throw new IllegalArgumentException((new StringBuilder()).append("Duplicate creator property \"").append(s).append("\" (index ").append(integer).append(" vs ").append(i).append(")").toString());
        _propertyBasedArgs = acreatorproperty;
        return;
    }

    public void addStringCreator(AnnotatedWithParams annotatedwithparams)
    {
        _stringCreator = verifyNonDup(annotatedwithparams, _stringCreator, "String");
    }

    public ValueInstantiator constructValueInstantiator(DeserializationConfig deserializationconfig)
    {
        StdValueInstantiator stdvalueinstantiator = new StdValueInstantiator(deserializationconfig, _beanDesc.getType());
        if (_delegateCreator == null)
        {
            deserializationconfig = null;
        } else
        {
            deserializationconfig = _beanDesc.bindingsForBeanType().resolveType(_delegateCreator.getParameterType(0));
        }
        stdvalueinstantiator.configureFromObjectSettings(_defaultConstructor, _delegateCreator, deserializationconfig, _propertyBasedCreator, _propertyBasedArgs);
        stdvalueinstantiator.configureFromStringCreator(_stringCreator);
        stdvalueinstantiator.configureFromIntCreator(_intCreator);
        stdvalueinstantiator.configureFromLongCreator(_longCreator);
        stdvalueinstantiator.configureFromDoubleCreator(_doubleCreator);
        stdvalueinstantiator.configureFromBooleanCreator(_booleanCreator);
        return stdvalueinstantiator;
    }

    public void setDefaultConstructor(AnnotatedConstructor annotatedconstructor)
    {
        _defaultConstructor = annotatedconstructor;
    }

    protected AnnotatedWithParams verifyNonDup(AnnotatedWithParams annotatedwithparams, AnnotatedWithParams annotatedwithparams1, String s)
    {
        if (annotatedwithparams1 != null && annotatedwithparams1.getClass() == annotatedwithparams.getClass())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Conflicting ").append(s).append(" creators: already had ").append(annotatedwithparams1).append(", encountered ").append(annotatedwithparams).toString());
        }
        if (_canFixAccess)
        {
            ClassUtil.checkAndFixAccess((Member)annotatedwithparams.getAnnotated());
        }
        return annotatedwithparams;
    }
}
