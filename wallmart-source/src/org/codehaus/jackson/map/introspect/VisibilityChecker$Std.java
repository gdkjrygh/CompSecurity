// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.introspect;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonMethod;

// Referenced classes of package org.codehaus.jackson.map.introspect:
//            VisibilityChecker, AnnotatedMember, AnnotatedField, AnnotatedMethod

public static class _fieldMinLevel
    implements VisibilityChecker
{

    protected static final withVisibility DEFAULT = new <init>((JsonAutoDetect)org/codehaus/jackson/map/introspect/VisibilityChecker$Std.getAnnotation(org/codehaus/jackson/annotate/JsonAutoDetect));
    protected final org.codehaus.jackson.annotate.ity _creatorMinLevel;
    protected final org.codehaus.jackson.annotate.ity _fieldMinLevel;
    protected final org.codehaus.jackson.annotate.ity _getterMinLevel;
    protected final org.codehaus.jackson.annotate.ity _isGetterMinLevel;
    protected final org.codehaus.jackson.annotate.ity _setterMinLevel;

    public static _fieldMinLevel defaultInstance()
    {
        return DEFAULT;
    }

    private static boolean hasMethod(JsonMethod ajsonmethod[], JsonMethod jsonmethod)
    {
        int j = ajsonmethod.length;
        for (int i = 0; i < j; i++)
        {
            JsonMethod jsonmethod1 = ajsonmethod[i];
            if (jsonmethod1 == jsonmethod || jsonmethod1 == JsonMethod.ALL)
            {
                return true;
            }
        }

        return false;
    }

    public boolean isCreatorVisible(Member member)
    {
        return _creatorMinLevel.isVisible(member);
    }

    public boolean isCreatorVisible(AnnotatedMember annotatedmember)
    {
        return isCreatorVisible(annotatedmember.getMember());
    }

    public boolean isFieldVisible(Field field)
    {
        return _fieldMinLevel.isVisible(field);
    }

    public boolean isFieldVisible(AnnotatedField annotatedfield)
    {
        return isFieldVisible(annotatedfield.getAnnotated());
    }

    public boolean isGetterVisible(Method method)
    {
        return _getterMinLevel.isVisible(method);
    }

    public boolean isGetterVisible(AnnotatedMethod annotatedmethod)
    {
        return isGetterVisible(annotatedmethod.getAnnotated());
    }

    public boolean isIsGetterVisible(Method method)
    {
        return _isGetterMinLevel.isVisible(method);
    }

    public boolean isIsGetterVisible(AnnotatedMethod annotatedmethod)
    {
        return isIsGetterVisible(annotatedmethod.getAnnotated());
    }

    public boolean isSetterVisible(Method method)
    {
        return _setterMinLevel.isVisible(method);
    }

    public boolean isSetterVisible(AnnotatedMethod annotatedmethod)
    {
        return isSetterVisible(annotatedmethod.getAnnotated());
    }

    public String toString()
    {
        return (new StringBuilder("[Visibility:")).append(" getter: ").append(_getterMinLevel).append(", isGetter: ").append(_isGetterMinLevel).append(", setter: ").append(_setterMinLevel).append(", creator: ").append(_creatorMinLevel).append(", field: ").append(_fieldMinLevel).append("]").toString();
    }

    public _fieldMinLevel with(org.codehaus.jackson.annotate.ity ity)
    {
        if (ity == org.codehaus.jackson.annotate.ity.DEFAULT)
        {
            return DEFAULT;
        } else
        {
            return new <init>(ity);
        }
    }

    public <init> with(JsonAutoDetect jsonautodetect)
    {
        if (jsonautodetect == null)
        {
            return this;
        }
        JsonMethod ajsonmethod[] = jsonautodetect.value();
        Object obj;
        <init> <init>1;
        if (hasMethod(ajsonmethod, JsonMethod.GETTER))
        {
            obj = jsonautodetect.getterVisibility();
        } else
        {
            obj = org.codehaus.jackson.annotate.ity.NONE;
        }
        <init>1 = withGetterVisibility(((org.codehaus.jackson.annotate.ity) (obj)));
        if (hasMethod(ajsonmethod, JsonMethod.IS_GETTER))
        {
            obj = jsonautodetect.isGetterVisibility();
        } else
        {
            obj = org.codehaus.jackson.annotate.ity.NONE;
        }
        <init>1 = <init>1.withIsGetterVisibility(((org.codehaus.jackson.annotate.ity) (obj)));
        if (hasMethod(ajsonmethod, JsonMethod.SETTER))
        {
            obj = jsonautodetect.setterVisibility();
        } else
        {
            obj = org.codehaus.jackson.annotate.ity.NONE;
        }
        <init>1 = <init>1.withSetterVisibility(((org.codehaus.jackson.annotate.ity) (obj)));
        if (hasMethod(ajsonmethod, JsonMethod.CREATOR))
        {
            obj = jsonautodetect.creatorVisibility();
        } else
        {
            obj = org.codehaus.jackson.annotate.ity.NONE;
        }
        obj = <init>1.withCreatorVisibility(((org.codehaus.jackson.annotate.ity) (obj)));
        if (hasMethod(ajsonmethod, JsonMethod.FIELD))
        {
            jsonautodetect = jsonautodetect.fieldVisibility();
        } else
        {
            jsonautodetect = org.codehaus.jackson.annotate.ity.NONE;
        }
        return ((NE) (obj)).withFieldVisibility(jsonautodetect);
    }

    public volatile VisibilityChecker with(org.codehaus.jackson.annotate.ity ity)
    {
        return with(ity);
    }

    public volatile VisibilityChecker with(JsonAutoDetect jsonautodetect)
    {
        return with(jsonautodetect);
    }

    public with withCreatorVisibility(org.codehaus.jackson.annotate.ity ity)
    {
        org.codehaus.jackson.annotate.ity ity1 = ity;
        if (ity == org.codehaus.jackson.annotate.ity.DEFAULT)
        {
            ity1 = DEFAULT._creatorMinLevel;
        }
        if (_creatorMinLevel == ity1)
        {
            return this;
        } else
        {
            return new <init>(_getterMinLevel, _isGetterMinLevel, _setterMinLevel, ity1, _fieldMinLevel);
        }
    }

    public volatile VisibilityChecker withCreatorVisibility(org.codehaus.jackson.annotate.ity ity)
    {
        return withCreatorVisibility(ity);
    }

    public withCreatorVisibility withFieldVisibility(org.codehaus.jackson.annotate.ity ity)
    {
        org.codehaus.jackson.annotate.ity ity1 = ity;
        if (ity == org.codehaus.jackson.annotate.ity.DEFAULT)
        {
            ity1 = DEFAULT._fieldMinLevel;
        }
        if (_fieldMinLevel == ity1)
        {
            return this;
        } else
        {
            return new <init>(_getterMinLevel, _isGetterMinLevel, _setterMinLevel, _creatorMinLevel, ity1);
        }
    }

    public volatile VisibilityChecker withFieldVisibility(org.codehaus.jackson.annotate.ity ity)
    {
        return withFieldVisibility(ity);
    }

    public withFieldVisibility withGetterVisibility(org.codehaus.jackson.annotate.ity ity)
    {
        org.codehaus.jackson.annotate.ity ity1 = ity;
        if (ity == org.codehaus.jackson.annotate.ity.DEFAULT)
        {
            ity1 = DEFAULT._getterMinLevel;
        }
        if (_getterMinLevel == ity1)
        {
            return this;
        } else
        {
            return new <init>(ity1, _isGetterMinLevel, _setterMinLevel, _creatorMinLevel, _fieldMinLevel);
        }
    }

    public volatile VisibilityChecker withGetterVisibility(org.codehaus.jackson.annotate.ity ity)
    {
        return withGetterVisibility(ity);
    }

    public withGetterVisibility withIsGetterVisibility(org.codehaus.jackson.annotate.ity ity)
    {
        org.codehaus.jackson.annotate.ity ity1 = ity;
        if (ity == org.codehaus.jackson.annotate.ity.DEFAULT)
        {
            ity1 = DEFAULT._isGetterMinLevel;
        }
        if (_isGetterMinLevel == ity1)
        {
            return this;
        } else
        {
            return new <init>(_getterMinLevel, ity1, _setterMinLevel, _creatorMinLevel, _fieldMinLevel);
        }
    }

    public volatile VisibilityChecker withIsGetterVisibility(org.codehaus.jackson.annotate.ity ity)
    {
        return withIsGetterVisibility(ity);
    }

    public withIsGetterVisibility withSetterVisibility(org.codehaus.jackson.annotate.ity ity)
    {
        org.codehaus.jackson.annotate.ity ity1 = ity;
        if (ity == org.codehaus.jackson.annotate.ity.DEFAULT)
        {
            ity1 = DEFAULT._setterMinLevel;
        }
        if (_setterMinLevel == ity1)
        {
            return this;
        } else
        {
            return new <init>(_getterMinLevel, _isGetterMinLevel, ity1, _creatorMinLevel, _fieldMinLevel);
        }
    }

    public volatile VisibilityChecker withSetterVisibility(org.codehaus.jackson.annotate.ity ity)
    {
        return withSetterVisibility(ity);
    }

    public withSetterVisibility withVisibility(JsonMethod jsonmethod, org.codehaus.jackson.annotate.ity ity)
    {
        switch (witchMap.org.codehaus.jackson.annotate.JsonMethod[jsonmethod.ordinal()])
        {
        default:
            return this;

        case 1: // '\001'
            return withGetterVisibility(ity);

        case 2: // '\002'
            return withSetterVisibility(ity);

        case 3: // '\003'
            return withCreatorVisibility(ity);

        case 4: // '\004'
            return withFieldVisibility(ity);

        case 5: // '\005'
            return withIsGetterVisibility(ity);

        case 6: // '\006'
            return with(ity);
        }
    }

    public volatile VisibilityChecker withVisibility(JsonMethod jsonmethod, org.codehaus.jackson.annotate.ity ity)
    {
        return withVisibility(jsonmethod, ity);
    }


    public (org.codehaus.jackson.annotate.ity ity)
    {
        if (ity == org.codehaus.jackson.annotate.ity.DEFAULT)
        {
            _getterMinLevel = DEFAULT._getterMinLevel;
            _isGetterMinLevel = DEFAULT._isGetterMinLevel;
            _setterMinLevel = DEFAULT._setterMinLevel;
            _creatorMinLevel = DEFAULT._creatorMinLevel;
            _fieldMinLevel = DEFAULT._fieldMinLevel;
            return;
        } else
        {
            _getterMinLevel = ity;
            _isGetterMinLevel = ity;
            _setterMinLevel = ity;
            _creatorMinLevel = ity;
            _fieldMinLevel = ity;
            return;
        }
    }

    public _fieldMinLevel(org.codehaus.jackson.annotate.ity ity, org.codehaus.jackson.annotate.ity ity1, org.codehaus.jackson.annotate.ity ity2, org.codehaus.jackson.annotate.ity ity3, org.codehaus.jackson.annotate.ity ity4)
    {
        _getterMinLevel = ity;
        _isGetterMinLevel = ity1;
        _setterMinLevel = ity2;
        _creatorMinLevel = ity3;
        _fieldMinLevel = ity4;
    }

    public _fieldMinLevel(JsonAutoDetect jsonautodetect)
    {
        JsonMethod ajsonmethod[] = jsonautodetect.value();
        org.codehaus.jackson.annotate.ity ity;
        if (hasMethod(ajsonmethod, JsonMethod.GETTER))
        {
            ity = jsonautodetect.getterVisibility();
        } else
        {
            ity = org.codehaus.jackson.annotate.ity.NONE;
        }
        _getterMinLevel = ity;
        if (hasMethod(ajsonmethod, JsonMethod.IS_GETTER))
        {
            ity = jsonautodetect.isGetterVisibility();
        } else
        {
            ity = org.codehaus.jackson.annotate.ity.NONE;
        }
        _isGetterMinLevel = ity;
        if (hasMethod(ajsonmethod, JsonMethod.SETTER))
        {
            ity = jsonautodetect.setterVisibility();
        } else
        {
            ity = org.codehaus.jackson.annotate.ity.NONE;
        }
        _setterMinLevel = ity;
        if (hasMethod(ajsonmethod, JsonMethod.CREATOR))
        {
            ity = jsonautodetect.creatorVisibility();
        } else
        {
            ity = org.codehaus.jackson.annotate.ity.NONE;
        }
        _creatorMinLevel = ity;
        if (hasMethod(ajsonmethod, JsonMethod.FIELD))
        {
            jsonautodetect = jsonautodetect.fieldVisibility();
        } else
        {
            jsonautodetect = org.codehaus.jackson.annotate.ity.NONE;
        }
        _fieldMinLevel = jsonautodetect;
    }
}
