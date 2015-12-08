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
//            AnnotatedMember, AnnotatedField, AnnotatedMethod

public interface VisibilityChecker
{
    public static class Std
        implements VisibilityChecker
    {

        protected static final Std DEFAULT = new Std((JsonAutoDetect)org/codehaus/jackson/map/introspect/VisibilityChecker$Std.getAnnotation(org/codehaus/jackson/annotate/JsonAutoDetect));
        protected final org.codehaus.jackson.annotate.JsonAutoDetect.Visibility _creatorMinLevel;
        protected final org.codehaus.jackson.annotate.JsonAutoDetect.Visibility _fieldMinLevel;
        protected final org.codehaus.jackson.annotate.JsonAutoDetect.Visibility _getterMinLevel;
        protected final org.codehaus.jackson.annotate.JsonAutoDetect.Visibility _isGetterMinLevel;
        protected final org.codehaus.jackson.annotate.JsonAutoDetect.Visibility _setterMinLevel;

        public static Std defaultInstance()
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

        public Std with(org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility)
        {
            if (visibility == org.codehaus.jackson.annotate.JsonAutoDetect.Visibility.DEFAULT)
            {
                return DEFAULT;
            } else
            {
                return new Std(visibility);
            }
        }

        public Std with(JsonAutoDetect jsonautodetect)
        {
            if (jsonautodetect == null)
            {
                return this;
            }
            JsonMethod ajsonmethod[] = jsonautodetect.value();
            Object obj;
            Std std;
            if (hasMethod(ajsonmethod, JsonMethod.GETTER))
            {
                obj = jsonautodetect.getterVisibility();
            } else
            {
                obj = org.codehaus.jackson.annotate.JsonAutoDetect.Visibility.NONE;
            }
            std = withGetterVisibility(((org.codehaus.jackson.annotate.JsonAutoDetect.Visibility) (obj)));
            if (hasMethod(ajsonmethod, JsonMethod.IS_GETTER))
            {
                obj = jsonautodetect.isGetterVisibility();
            } else
            {
                obj = org.codehaus.jackson.annotate.JsonAutoDetect.Visibility.NONE;
            }
            std = std.withIsGetterVisibility(((org.codehaus.jackson.annotate.JsonAutoDetect.Visibility) (obj)));
            if (hasMethod(ajsonmethod, JsonMethod.SETTER))
            {
                obj = jsonautodetect.setterVisibility();
            } else
            {
                obj = org.codehaus.jackson.annotate.JsonAutoDetect.Visibility.NONE;
            }
            std = std.withSetterVisibility(((org.codehaus.jackson.annotate.JsonAutoDetect.Visibility) (obj)));
            if (hasMethod(ajsonmethod, JsonMethod.CREATOR))
            {
                obj = jsonautodetect.creatorVisibility();
            } else
            {
                obj = org.codehaus.jackson.annotate.JsonAutoDetect.Visibility.NONE;
            }
            obj = std.withCreatorVisibility(((org.codehaus.jackson.annotate.JsonAutoDetect.Visibility) (obj)));
            if (hasMethod(ajsonmethod, JsonMethod.FIELD))
            {
                jsonautodetect = jsonautodetect.fieldVisibility();
            } else
            {
                jsonautodetect = org.codehaus.jackson.annotate.JsonAutoDetect.Visibility.NONE;
            }
            return ((Std) (obj)).withFieldVisibility(jsonautodetect);
        }

        public volatile VisibilityChecker with(org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility)
        {
            return with(visibility);
        }

        public volatile VisibilityChecker with(JsonAutoDetect jsonautodetect)
        {
            return with(jsonautodetect);
        }

        public Std withCreatorVisibility(org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility)
        {
            org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility1 = visibility;
            if (visibility == org.codehaus.jackson.annotate.JsonAutoDetect.Visibility.DEFAULT)
            {
                visibility1 = DEFAULT._creatorMinLevel;
            }
            if (_creatorMinLevel == visibility1)
            {
                return this;
            } else
            {
                return new Std(_getterMinLevel, _isGetterMinLevel, _setterMinLevel, visibility1, _fieldMinLevel);
            }
        }

        public volatile VisibilityChecker withCreatorVisibility(org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility)
        {
            return withCreatorVisibility(visibility);
        }

        public Std withFieldVisibility(org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility)
        {
            org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility1 = visibility;
            if (visibility == org.codehaus.jackson.annotate.JsonAutoDetect.Visibility.DEFAULT)
            {
                visibility1 = DEFAULT._fieldMinLevel;
            }
            if (_fieldMinLevel == visibility1)
            {
                return this;
            } else
            {
                return new Std(_getterMinLevel, _isGetterMinLevel, _setterMinLevel, _creatorMinLevel, visibility1);
            }
        }

        public volatile VisibilityChecker withFieldVisibility(org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility)
        {
            return withFieldVisibility(visibility);
        }

        public Std withGetterVisibility(org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility)
        {
            org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility1 = visibility;
            if (visibility == org.codehaus.jackson.annotate.JsonAutoDetect.Visibility.DEFAULT)
            {
                visibility1 = DEFAULT._getterMinLevel;
            }
            if (_getterMinLevel == visibility1)
            {
                return this;
            } else
            {
                return new Std(visibility1, _isGetterMinLevel, _setterMinLevel, _creatorMinLevel, _fieldMinLevel);
            }
        }

        public volatile VisibilityChecker withGetterVisibility(org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility)
        {
            return withGetterVisibility(visibility);
        }

        public Std withIsGetterVisibility(org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility)
        {
            org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility1 = visibility;
            if (visibility == org.codehaus.jackson.annotate.JsonAutoDetect.Visibility.DEFAULT)
            {
                visibility1 = DEFAULT._isGetterMinLevel;
            }
            if (_isGetterMinLevel == visibility1)
            {
                return this;
            } else
            {
                return new Std(_getterMinLevel, visibility1, _setterMinLevel, _creatorMinLevel, _fieldMinLevel);
            }
        }

        public volatile VisibilityChecker withIsGetterVisibility(org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility)
        {
            return withIsGetterVisibility(visibility);
        }

        public Std withSetterVisibility(org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility)
        {
            org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility1 = visibility;
            if (visibility == org.codehaus.jackson.annotate.JsonAutoDetect.Visibility.DEFAULT)
            {
                visibility1 = DEFAULT._setterMinLevel;
            }
            if (_setterMinLevel == visibility1)
            {
                return this;
            } else
            {
                return new Std(_getterMinLevel, _isGetterMinLevel, visibility1, _creatorMinLevel, _fieldMinLevel);
            }
        }

        public volatile VisibilityChecker withSetterVisibility(org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility)
        {
            return withSetterVisibility(visibility);
        }

        public Std withVisibility(JsonMethod jsonmethod, org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility)
        {
            static class _cls1
            {

                static final int $SwitchMap$org$codehaus$jackson$annotate$JsonMethod[];

                static 
                {
                    $SwitchMap$org$codehaus$jackson$annotate$JsonMethod = new int[JsonMethod.values().length];
                    try
                    {
                        $SwitchMap$org$codehaus$jackson$annotate$JsonMethod[JsonMethod.GETTER.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        $SwitchMap$org$codehaus$jackson$annotate$JsonMethod[JsonMethod.SETTER.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        $SwitchMap$org$codehaus$jackson$annotate$JsonMethod[JsonMethod.CREATOR.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        $SwitchMap$org$codehaus$jackson$annotate$JsonMethod[JsonMethod.FIELD.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$org$codehaus$jackson$annotate$JsonMethod[JsonMethod.IS_GETTER.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$org$codehaus$jackson$annotate$JsonMethod[JsonMethod.ALL.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls1..SwitchMap.org.codehaus.jackson.annotate.JsonMethod[jsonmethod.ordinal()])
            {
            default:
                return this;

            case 1: // '\001'
                return withGetterVisibility(visibility);

            case 2: // '\002'
                return withSetterVisibility(visibility);

            case 3: // '\003'
                return withCreatorVisibility(visibility);

            case 4: // '\004'
                return withFieldVisibility(visibility);

            case 5: // '\005'
                return withIsGetterVisibility(visibility);

            case 6: // '\006'
                return with(visibility);
            }
        }

        public volatile VisibilityChecker withVisibility(JsonMethod jsonmethod, org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility)
        {
            return withVisibility(jsonmethod, visibility);
        }


        public Std(org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility)
        {
            if (visibility == org.codehaus.jackson.annotate.JsonAutoDetect.Visibility.DEFAULT)
            {
                _getterMinLevel = DEFAULT._getterMinLevel;
                _isGetterMinLevel = DEFAULT._isGetterMinLevel;
                _setterMinLevel = DEFAULT._setterMinLevel;
                _creatorMinLevel = DEFAULT._creatorMinLevel;
                _fieldMinLevel = DEFAULT._fieldMinLevel;
                return;
            } else
            {
                _getterMinLevel = visibility;
                _isGetterMinLevel = visibility;
                _setterMinLevel = visibility;
                _creatorMinLevel = visibility;
                _fieldMinLevel = visibility;
                return;
            }
        }

        public Std(org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility, org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility1, org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility2, org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility3, org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility4)
        {
            _getterMinLevel = visibility;
            _isGetterMinLevel = visibility1;
            _setterMinLevel = visibility2;
            _creatorMinLevel = visibility3;
            _fieldMinLevel = visibility4;
        }

        public Std(JsonAutoDetect jsonautodetect)
        {
            JsonMethod ajsonmethod[] = jsonautodetect.value();
            org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility;
            if (hasMethod(ajsonmethod, JsonMethod.GETTER))
            {
                visibility = jsonautodetect.getterVisibility();
            } else
            {
                visibility = org.codehaus.jackson.annotate.JsonAutoDetect.Visibility.NONE;
            }
            _getterMinLevel = visibility;
            if (hasMethod(ajsonmethod, JsonMethod.IS_GETTER))
            {
                visibility = jsonautodetect.isGetterVisibility();
            } else
            {
                visibility = org.codehaus.jackson.annotate.JsonAutoDetect.Visibility.NONE;
            }
            _isGetterMinLevel = visibility;
            if (hasMethod(ajsonmethod, JsonMethod.SETTER))
            {
                visibility = jsonautodetect.setterVisibility();
            } else
            {
                visibility = org.codehaus.jackson.annotate.JsonAutoDetect.Visibility.NONE;
            }
            _setterMinLevel = visibility;
            if (hasMethod(ajsonmethod, JsonMethod.CREATOR))
            {
                visibility = jsonautodetect.creatorVisibility();
            } else
            {
                visibility = org.codehaus.jackson.annotate.JsonAutoDetect.Visibility.NONE;
            }
            _creatorMinLevel = visibility;
            if (hasMethod(ajsonmethod, JsonMethod.FIELD))
            {
                jsonautodetect = jsonautodetect.fieldVisibility();
            } else
            {
                jsonautodetect = org.codehaus.jackson.annotate.JsonAutoDetect.Visibility.NONE;
            }
            _fieldMinLevel = jsonautodetect;
        }
    }


    public abstract boolean isCreatorVisible(Member member);

    public abstract boolean isCreatorVisible(AnnotatedMember annotatedmember);

    public abstract boolean isFieldVisible(Field field);

    public abstract boolean isFieldVisible(AnnotatedField annotatedfield);

    public abstract boolean isGetterVisible(Method method);

    public abstract boolean isGetterVisible(AnnotatedMethod annotatedmethod);

    public abstract boolean isIsGetterVisible(Method method);

    public abstract boolean isIsGetterVisible(AnnotatedMethod annotatedmethod);

    public abstract boolean isSetterVisible(Method method);

    public abstract boolean isSetterVisible(AnnotatedMethod annotatedmethod);

    public abstract VisibilityChecker with(org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility);

    public abstract VisibilityChecker with(JsonAutoDetect jsonautodetect);

    public abstract VisibilityChecker withCreatorVisibility(org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility);

    public abstract VisibilityChecker withFieldVisibility(org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility);

    public abstract VisibilityChecker withGetterVisibility(org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility);

    public abstract VisibilityChecker withIsGetterVisibility(org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility);

    public abstract VisibilityChecker withSetterVisibility(org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility);

    public abstract VisibilityChecker withVisibility(JsonMethod jsonmethod, org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility);
}
