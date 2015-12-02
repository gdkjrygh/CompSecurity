// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.internal.lang.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import org.aspectj.internal.lang.annotation.ajcDeclareAnnotation;
import org.aspectj.internal.lang.annotation.ajcDeclareEoW;
import org.aspectj.internal.lang.annotation.ajcDeclareParents;
import org.aspectj.internal.lang.annotation.ajcDeclarePrecedence;
import org.aspectj.internal.lang.annotation.ajcDeclareSoft;
import org.aspectj.internal.lang.annotation.ajcITD;
import org.aspectj.internal.lang.annotation.ajcPrivileged;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareError;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.DeclarePrecedence;
import org.aspectj.lang.annotation.DeclareWarning;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.Advice;
import org.aspectj.lang.reflect.AdviceKind;
import org.aspectj.lang.reflect.AjType;
import org.aspectj.lang.reflect.AjTypeSystem;
import org.aspectj.lang.reflect.DeclareAnnotation;
import org.aspectj.lang.reflect.DeclareErrorOrWarning;
import org.aspectj.lang.reflect.DeclareSoft;
import org.aspectj.lang.reflect.InterTypeConstructorDeclaration;
import org.aspectj.lang.reflect.InterTypeFieldDeclaration;
import org.aspectj.lang.reflect.InterTypeMethodDeclaration;
import org.aspectj.lang.reflect.NoSuchAdviceException;
import org.aspectj.lang.reflect.NoSuchPointcutException;
import org.aspectj.lang.reflect.PerClause;
import org.aspectj.lang.reflect.PerClauseKind;

// Referenced classes of package org.aspectj.internal.lang.reflect:
//            DeclareParentsImpl, InterTypeMethodDeclarationImpl, AdviceImpl, PointcutImpl, 
//            DeclareAnnotationImpl, DeclareErrorOrWarningImpl, DeclarePrecedenceImpl, DeclareSoftImpl, 
//            InterTypeConstructorDeclarationImpl, InterTypeFieldDeclarationImpl, PerClauseImpl, PointcutBasedPerClauseImpl, 
//            TypePatternBasedPerClauseImpl

public class AjTypeImpl
    implements AjType
{

    private static final String ajcMagic = "ajc$";
    private Advice advice[];
    private Class clazz;
    private Advice declaredAdvice[];
    private InterTypeConstructorDeclaration declaredITDCons[];
    private InterTypeFieldDeclaration declaredITDFields[];
    private InterTypeMethodDeclaration declaredITDMethods[];
    private org.aspectj.lang.reflect.Pointcut declaredPointcuts[];
    private InterTypeConstructorDeclaration itdCons[];
    private InterTypeFieldDeclaration itdFields[];
    private InterTypeMethodDeclaration itdMethods[];
    private org.aspectj.lang.reflect.Pointcut pointcuts[];

    public AjTypeImpl(Class class1)
    {
        declaredPointcuts = null;
        pointcuts = null;
        declaredAdvice = null;
        advice = null;
        declaredITDMethods = null;
        itdMethods = null;
        declaredITDFields = null;
        itdFields = null;
        itdCons = null;
        declaredITDCons = null;
        clazz = class1;
    }

    private void addAnnotationStyleDeclareParents(List list)
    {
        Field afield[] = clazz.getDeclaredFields();
        int j = afield.length;
        int i = 0;
        while (i < j) 
        {
            Object obj = afield[i];
            if (((Field) (obj)).isAnnotationPresent(org/aspectj/lang/annotation/DeclareParents) && ((Field) (obj)).getType().isInterface())
            {
                DeclareParents declareparents = (DeclareParents)((Field) (obj)).getAnnotation(org/aspectj/lang/annotation/DeclareParents);
                obj = ((Field) (obj)).getType().getName();
                list.add(new DeclareParentsImpl(declareparents.value(), ((String) (obj)), false, this));
            }
            i++;
        }
    }

    private void addAnnotationStyleITDFields(List list, boolean flag)
    {
    }

    private void addAnnotationStyleITDMethods(List list, boolean flag)
    {
        if (isAspect())
        {
            Field afield[] = clazz.getDeclaredFields();
            int k = afield.length;
            int i = 0;
            do
            {
                if (i >= k)
                {
                    break;
                }
                Field field = afield[i];
                if (field.getType().isInterface() && field.isAnnotationPresent(org/aspectj/lang/annotation/DeclareParents) && ((DeclareParents)field.getAnnotation(org/aspectj/lang/annotation/DeclareParents)).defaultImpl() != org/aspectj/lang/annotation/DeclareParents)
                {
                    Method amethod[] = field.getType().getDeclaredMethods();
                    int l = amethod.length;
                    int j = 0;
                    while (j < l) 
                    {
                        Method method = amethod[j];
                        if (Modifier.isPublic(method.getModifiers()) || !flag)
                        {
                            list.add(new InterTypeMethodDeclarationImpl(this, AjTypeSystem.getAjType(field.getType()), method, 1));
                        }
                        j++;
                    }
                }
                i++;
            } while (true);
        }
    }

    private Advice asAdvice(Method method)
    {
        if (method.getAnnotations().length != 0)
        {
            Object obj = (Before)method.getAnnotation(org/aspectj/lang/annotation/Before);
            if (obj != null)
            {
                return new AdviceImpl(method, ((Before) (obj)).value(), AdviceKind.BEFORE);
            }
            obj = (After)method.getAnnotation(org/aspectj/lang/annotation/After);
            if (obj != null)
            {
                return new AdviceImpl(method, ((After) (obj)).value(), AdviceKind.AFTER);
            }
            Object obj1 = (AfterReturning)method.getAnnotation(org/aspectj/lang/annotation/AfterReturning);
            if (obj1 != null)
            {
                String s = ((AfterReturning) (obj1)).pointcut();
                obj = s;
                if (s.equals(""))
                {
                    obj = ((AfterReturning) (obj1)).value();
                }
                return new AdviceImpl(method, ((String) (obj)), AdviceKind.AFTER_RETURNING, ((AfterReturning) (obj1)).returning());
            }
            obj1 = (AfterThrowing)method.getAnnotation(org/aspectj/lang/annotation/AfterThrowing);
            if (obj1 != null)
            {
                String s1 = ((AfterThrowing) (obj1)).pointcut();
                obj = s1;
                if (s1 == null)
                {
                    obj = ((AfterThrowing) (obj1)).value();
                }
                return new AdviceImpl(method, ((String) (obj)), AdviceKind.AFTER_THROWING, ((AfterThrowing) (obj1)).throwing());
            }
            obj = (Around)method.getAnnotation(org/aspectj/lang/annotation/Around);
            if (obj != null)
            {
                return new AdviceImpl(method, ((Around) (obj)).value(), AdviceKind.AROUND);
            }
        }
        return null;
    }

    private org.aspectj.lang.reflect.Pointcut asPointcut(Method method)
    {
        Pointcut pointcut = (Pointcut)method.getAnnotation(org/aspectj/lang/annotation/Pointcut);
        if (pointcut != null)
        {
            String s1 = method.getName();
            String s = s1;
            if (s1.startsWith("ajc$"))
            {
                s1 = s1.substring(s1.indexOf("$$") + 2, s1.length());
                int i = s1.indexOf("$");
                s = s1;
                if (i != -1)
                {
                    s = s1.substring(0, i);
                }
            }
            return new PointcutImpl(s, pointcut.value(), method, AjTypeSystem.getAjType(method.getDeclaringClass()), pointcut.argNames());
        } else
        {
            return null;
        }
    }

    private Advice[] getAdvice(Set set)
    {
        if (advice == null)
        {
            initAdvice();
        }
        ArrayList arraylist = new ArrayList();
        Advice aadvice[] = advice;
        int j = aadvice.length;
        for (int i = 0; i < j; i++)
        {
            Advice advice1 = aadvice[i];
            if (set.contains(advice1.getKind()))
            {
                arraylist.add(advice1);
            }
        }

        set = new Advice[arraylist.size()];
        arraylist.toArray(set);
        return set;
    }

    private Advice[] getDeclaredAdvice(Set set)
    {
        if (declaredAdvice == null)
        {
            initDeclaredAdvice();
        }
        ArrayList arraylist = new ArrayList();
        Advice aadvice[] = declaredAdvice;
        int j = aadvice.length;
        for (int i = 0; i < j; i++)
        {
            Advice advice1 = aadvice[i];
            if (set.contains(advice1.getKind()))
            {
                arraylist.add(advice1);
            }
        }

        set = new Advice[arraylist.size()];
        arraylist.toArray(set);
        return set;
    }

    private void initAdvice()
    {
        Method amethod[] = clazz.getMethods();
        ArrayList arraylist = new ArrayList();
        int j = amethod.length;
        for (int i = 0; i < j; i++)
        {
            Advice advice1 = asAdvice(amethod[i]);
            if (advice1 != null)
            {
                arraylist.add(advice1);
            }
        }

        advice = new Advice[arraylist.size()];
        arraylist.toArray(advice);
    }

    private void initDeclaredAdvice()
    {
        Method amethod[] = clazz.getDeclaredMethods();
        ArrayList arraylist = new ArrayList();
        int j = amethod.length;
        for (int i = 0; i < j; i++)
        {
            Advice advice1 = asAdvice(amethod[i]);
            if (advice1 != null)
            {
                arraylist.add(advice1);
            }
        }

        declaredAdvice = new Advice[arraylist.size()];
        arraylist.toArray(declaredAdvice);
    }

    private boolean isReallyAMethod(Method method)
    {
        if (!method.getName().startsWith("ajc$"))
        {
            if (method.getAnnotations().length == 0)
            {
                return true;
            }
            if (!method.isAnnotationPresent(org/aspectj/lang/annotation/Pointcut) && !method.isAnnotationPresent(org/aspectj/lang/annotation/Before) && !method.isAnnotationPresent(org/aspectj/lang/annotation/After) && !method.isAnnotationPresent(org/aspectj/lang/annotation/AfterReturning) && !method.isAnnotationPresent(org/aspectj/lang/annotation/AfterThrowing) && !method.isAnnotationPresent(org/aspectj/lang/annotation/Around))
            {
                return true;
            }
        }
        return false;
    }

    private AjType[] toAjTypeArray(Class aclass[])
    {
        AjType aajtype[] = new AjType[aclass.length];
        for (int i = 0; i < aajtype.length; i++)
        {
            aajtype[i] = AjTypeSystem.getAjType(aclass[i]);
        }

        return aajtype;
    }

    private Class[] toClassArray(AjType aajtype[])
    {
        Class aclass[] = new Class[aajtype.length];
        for (int i = 0; i < aclass.length; i++)
        {
            aclass[i] = aajtype[i].getJavaClass();
        }

        return aclass;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof AjTypeImpl))
        {
            return false;
        } else
        {
            return ((AjTypeImpl)obj).clazz.equals(clazz);
        }
    }

    public Advice getAdvice(String s)
        throws NoSuchAdviceException
    {
        if (s.equals(""))
        {
            throw new IllegalArgumentException("use getAdvice(AdviceType...) instead for un-named advice");
        }
        if (advice == null)
        {
            initAdvice();
        }
        Advice aadvice[] = advice;
        int j = aadvice.length;
        for (int i = 0; i < j; i++)
        {
            Advice advice1 = aadvice[i];
            if (advice1.getName().equals(s))
            {
                return advice1;
            }
        }

        throw new NoSuchAdviceException(s);
    }

    public transient Advice[] getAdvice(AdviceKind aadvicekind[])
    {
        if (aadvicekind.length == 0)
        {
            aadvicekind = EnumSet.allOf(org/aspectj/lang/reflect/AdviceKind);
        } else
        {
            EnumSet enumset = EnumSet.noneOf(org/aspectj/lang/reflect/AdviceKind);
            enumset.addAll(Arrays.asList(aadvicekind));
            aadvicekind = enumset;
        }
        return getAdvice(((Set) (aadvicekind)));
    }

    public AjType[] getAjTypes()
    {
        return toAjTypeArray(clazz.getClasses());
    }

    public Annotation getAnnotation(Class class1)
    {
        return clazz.getAnnotation(class1);
    }

    public Annotation[] getAnnotations()
    {
        return clazz.getAnnotations();
    }

    public transient Constructor getConstructor(AjType aajtype[])
        throws NoSuchMethodException
    {
        return clazz.getConstructor(toClassArray(aajtype));
    }

    public Constructor[] getConstructors()
    {
        return clazz.getConstructors();
    }

    public DeclareAnnotation[] getDeclareAnnotations()
    {
        ArrayList arraylist;
        Method amethod[];
        int i;
        int k;
        arraylist = new ArrayList();
        amethod = clazz.getDeclaredMethods();
        k = amethod.length;
        i = 0;
_L10:
        if (i >= k) goto _L2; else goto _L1
_L1:
        Object obj = amethod[i];
        if (!((Method) (obj)).isAnnotationPresent(org/aspectj/internal/lang/annotation/ajcDeclareAnnotation)) goto _L4; else goto _L3
_L3:
        Object obj1;
        ajcDeclareAnnotation ajcdeclareannotation;
        Annotation aannotation[];
        int j;
        int l;
        ajcdeclareannotation = (ajcDeclareAnnotation)((Method) (obj)).getAnnotation(org/aspectj/internal/lang/annotation/ajcDeclareAnnotation);
        obj1 = null;
        aannotation = ((Method) (obj)).getAnnotations();
        l = aannotation.length;
        j = 0;
_L8:
        obj = obj1;
        if (j >= l) goto _L6; else goto _L5
_L5:
        obj = aannotation[j];
        if (((Annotation) (obj)).annotationType() == org/aspectj/internal/lang/annotation/ajcDeclareAnnotation) goto _L7; else goto _L6
_L6:
        arraylist.add(new DeclareAnnotationImpl(this, ajcdeclareannotation.kind(), ajcdeclareannotation.pattern(), ((Annotation) (obj)), ajcdeclareannotation.annotation()));
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L7:
        j++;
        if (true) goto _L8; else goto _L2
_L2:
        if (getSupertype().isAspect())
        {
            arraylist.addAll(Arrays.asList(getSupertype().getDeclareAnnotations()));
        }
        DeclareAnnotation adeclareannotation[] = new DeclareAnnotation[arraylist.size()];
        arraylist.toArray(adeclareannotation);
        return adeclareannotation;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public DeclareErrorOrWarning[] getDeclareErrorOrWarnings()
    {
        ArrayList arraylist;
        Field afield[];
        int i;
        int j;
        arraylist = new ArrayList();
        afield = clazz.getDeclaredFields();
        j = afield.length;
        i = 0;
_L2:
        Object obj;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        obj = afield[i];
        if (((Field) (obj)).isAnnotationPresent(org/aspectj/lang/annotation/DeclareWarning))
        {
            DeclareWarning declarewarning = (DeclareWarning)((Field) (obj)).getAnnotation(org/aspectj/lang/annotation/DeclareWarning);
            if (Modifier.isPublic(((Field) (obj)).getModifiers()) && Modifier.isStatic(((Field) (obj)).getModifiers()))
            {
                obj = (String)((Field) (obj)).get(null);
                arraylist.add(new DeclareErrorOrWarningImpl(declarewarning.value(), ((String) (obj)), false, this));
            }
            break MISSING_BLOCK_LABEL_306;
        }
        Object aobj[];
        int k;
        try
        {
            if (((Field) (obj)).isAnnotationPresent(org/aspectj/lang/annotation/DeclareError))
            {
                DeclareError declareerror = (DeclareError)((Field) (obj)).getAnnotation(org/aspectj/lang/annotation/DeclareError);
                if (Modifier.isPublic(((Field) (obj)).getModifiers()) && Modifier.isStatic(((Field) (obj)).getModifiers()))
                {
                    obj = (String)((Field) (obj)).get(null);
                    arraylist.add(new DeclareErrorOrWarningImpl(declareerror.value(), ((String) (obj)), true, this));
                }
            }
        }
        catch (IllegalArgumentException illegalargumentexception) { }
        catch (IllegalAccessException illegalaccessexception) { }
        break MISSING_BLOCK_LABEL_306;
        aobj = clazz.getDeclaredMethods();
        k = aobj.length;
        for (i = 0; i < k; i++)
        {
            illegalargumentexception = aobj[i];
            if (illegalargumentexception.isAnnotationPresent(org/aspectj/internal/lang/annotation/ajcDeclareEoW))
            {
                illegalargumentexception = (ajcDeclareEoW)illegalargumentexception.getAnnotation(org/aspectj/internal/lang/annotation/ajcDeclareEoW);
                arraylist.add(new DeclareErrorOrWarningImpl(illegalargumentexception.pointcut(), illegalargumentexception.message(), illegalargumentexception.isError(), this));
            }
        }

        aobj = new DeclareErrorOrWarning[arraylist.size()];
        arraylist.toArray(aobj);
        return ((DeclareErrorOrWarning []) (aobj));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public org.aspectj.lang.reflect.DeclareParents[] getDeclareParents()
    {
        ArrayList arraylist = new ArrayList();
        Object aobj[] = clazz.getDeclaredMethods();
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = aobj[i];
            if (((Method) (obj)).isAnnotationPresent(org/aspectj/internal/lang/annotation/ajcDeclareParents))
            {
                obj = (ajcDeclareParents)((Method) (obj)).getAnnotation(org/aspectj/internal/lang/annotation/ajcDeclareParents);
                arraylist.add(new DeclareParentsImpl(((ajcDeclareParents) (obj)).targetTypePattern(), ((ajcDeclareParents) (obj)).parentTypes(), ((ajcDeclareParents) (obj)).isExtends(), this));
            }
        }

        addAnnotationStyleDeclareParents(arraylist);
        if (getSupertype().isAspect())
        {
            arraylist.addAll(Arrays.asList(getSupertype().getDeclareParents()));
        }
        aobj = new org.aspectj.lang.reflect.DeclareParents[arraylist.size()];
        arraylist.toArray(aobj);
        return ((org.aspectj.lang.reflect.DeclareParents []) (aobj));
    }

    public org.aspectj.lang.reflect.DeclarePrecedence[] getDeclarePrecedence()
    {
        ArrayList arraylist = new ArrayList();
        if (clazz.isAnnotationPresent(org/aspectj/lang/annotation/DeclarePrecedence))
        {
            arraylist.add(new DeclarePrecedenceImpl(((DeclarePrecedence)clazz.getAnnotation(org/aspectj/lang/annotation/DeclarePrecedence)).value(), this));
        }
        Object aobj[] = clazz.getDeclaredMethods();
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            Method method = aobj[i];
            if (method.isAnnotationPresent(org/aspectj/internal/lang/annotation/ajcDeclarePrecedence))
            {
                arraylist.add(new DeclarePrecedenceImpl(((ajcDeclarePrecedence)method.getAnnotation(org/aspectj/internal/lang/annotation/ajcDeclarePrecedence)).value(), this));
            }
        }

        if (getSupertype().isAspect())
        {
            arraylist.addAll(Arrays.asList(getSupertype().getDeclarePrecedence()));
        }
        aobj = new org.aspectj.lang.reflect.DeclarePrecedence[arraylist.size()];
        arraylist.toArray(aobj);
        return ((org.aspectj.lang.reflect.DeclarePrecedence []) (aobj));
    }

    public DeclareSoft[] getDeclareSofts()
    {
        ArrayList arraylist = new ArrayList();
        Object aobj[] = clazz.getDeclaredMethods();
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = aobj[i];
            if (((Method) (obj)).isAnnotationPresent(org/aspectj/internal/lang/annotation/ajcDeclareSoft))
            {
                obj = (ajcDeclareSoft)((Method) (obj)).getAnnotation(org/aspectj/internal/lang/annotation/ajcDeclareSoft);
                arraylist.add(new DeclareSoftImpl(this, ((ajcDeclareSoft) (obj)).pointcut(), ((ajcDeclareSoft) (obj)).exceptionType()));
            }
        }

        if (getSupertype().isAspect())
        {
            arraylist.addAll(Arrays.asList(getSupertype().getDeclareSofts()));
        }
        aobj = new DeclareSoft[arraylist.size()];
        arraylist.toArray(aobj);
        return ((DeclareSoft []) (aobj));
    }

    public Advice getDeclaredAdvice(String s)
        throws NoSuchAdviceException
    {
        if (s.equals(""))
        {
            throw new IllegalArgumentException("use getAdvice(AdviceType...) instead for un-named advice");
        }
        if (declaredAdvice == null)
        {
            initDeclaredAdvice();
        }
        Advice aadvice[] = declaredAdvice;
        int j = aadvice.length;
        for (int i = 0; i < j; i++)
        {
            Advice advice1 = aadvice[i];
            if (advice1.getName().equals(s))
            {
                return advice1;
            }
        }

        throw new NoSuchAdviceException(s);
    }

    public transient Advice[] getDeclaredAdvice(AdviceKind aadvicekind[])
    {
        if (aadvicekind.length == 0)
        {
            aadvicekind = EnumSet.allOf(org/aspectj/lang/reflect/AdviceKind);
        } else
        {
            EnumSet enumset = EnumSet.noneOf(org/aspectj/lang/reflect/AdviceKind);
            enumset.addAll(Arrays.asList(aadvicekind));
            aadvicekind = enumset;
        }
        return getDeclaredAdvice(((Set) (aadvicekind)));
    }

    public AjType[] getDeclaredAjTypes()
    {
        return toAjTypeArray(clazz.getDeclaredClasses());
    }

    public Annotation[] getDeclaredAnnotations()
    {
        return clazz.getDeclaredAnnotations();
    }

    public transient Constructor getDeclaredConstructor(AjType aajtype[])
        throws NoSuchMethodException
    {
        return clazz.getDeclaredConstructor(toClassArray(aajtype));
    }

    public Constructor[] getDeclaredConstructors()
    {
        return clazz.getDeclaredConstructors();
    }

    public Field getDeclaredField(String s)
        throws NoSuchFieldException
    {
        Field field = clazz.getDeclaredField(s);
        if (field.getName().startsWith("ajc$"))
        {
            throw new NoSuchFieldException(s);
        } else
        {
            return field;
        }
    }

    public Field[] getDeclaredFields()
    {
        Field afield[] = clazz.getDeclaredFields();
        ArrayList arraylist = new ArrayList();
        int j = afield.length;
        for (int i = 0; i < j; i++)
        {
            Field field = afield[i];
            if (!field.getName().startsWith("ajc$") && !field.isAnnotationPresent(org/aspectj/lang/annotation/DeclareWarning) && !field.isAnnotationPresent(org/aspectj/lang/annotation/DeclareError))
            {
                arraylist.add(field);
            }
        }

        afield = new Field[arraylist.size()];
        arraylist.toArray(afield);
        return afield;
    }

    public transient InterTypeConstructorDeclaration getDeclaredITDConstructor(AjType ajtype, AjType aajtype[])
        throws NoSuchMethodException
    {
        InterTypeConstructorDeclaration aintertypeconstructordeclaration[];
        int i;
        int k;
        aintertypeconstructordeclaration = getDeclaredITDConstructors();
        k = aintertypeconstructordeclaration.length;
        i = 0;
_L9:
        if (i >= k) goto _L2; else goto _L1
_L1:
        InterTypeConstructorDeclaration intertypeconstructordeclaration = aintertypeconstructordeclaration[i];
        if (!intertypeconstructordeclaration.getTargetType().equals(ajtype)) goto _L4; else goto _L3
_L3:
        AjType aajtype1[] = intertypeconstructordeclaration.getParameterTypes();
        if (aajtype1.length != aajtype.length) goto _L4; else goto _L5
_L5:
        int j = 0;
_L10:
        if (j >= aajtype1.length) goto _L7; else goto _L6
_L6:
        boolean flag = aajtype1[j].equals(aajtype[j]);
        if (flag) goto _L8; else goto _L4
_L4:
        i++;
          goto _L9
_L8:
        j++;
          goto _L10
_L2:
        throw new NoSuchMethodException();
_L7:
        return intertypeconstructordeclaration;
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
          goto _L4
    }

    public InterTypeConstructorDeclaration[] getDeclaredITDConstructors()
    {
label0:
        {
            if (declaredITDCons != null)
            {
                break label0;
            }
            ArrayList arraylist = new ArrayList();
            Method amethod[] = clazz.getDeclaredMethods();
            int j = amethod.length;
            int i = 0;
            do
            {
                if (i >= j)
                {
                    break;
                }
                Method method = amethod[i];
                if (method.getName().contains("ajc$postInterConstructor") && method.isAnnotationPresent(org/aspectj/internal/lang/annotation/ajcITD))
                {
                    ajcITD ajcitd = (ajcITD)method.getAnnotation(org/aspectj/internal/lang/annotation/ajcITD);
                    arraylist.add(new InterTypeConstructorDeclarationImpl(this, ajcitd.targetType(), ajcitd.modifiers(), method));
                }
                i++;
            } while (true);
            declaredITDCons = new InterTypeConstructorDeclaration[arraylist.size()];
            arraylist.toArray(declaredITDCons);
        }
        return declaredITDCons;
    }

    public InterTypeFieldDeclaration getDeclaredITDField(String s, AjType ajtype)
        throws NoSuchFieldException
    {
        InterTypeFieldDeclaration aintertypefielddeclaration[];
        int i;
        int j;
        aintertypefielddeclaration = getDeclaredITDFields();
        j = aintertypefielddeclaration.length;
        i = 0;
_L3:
        if (i >= j) goto _L2; else goto _L1
_L1:
        InterTypeFieldDeclaration intertypefielddeclaration;
        intertypefielddeclaration = aintertypefielddeclaration[i];
        if (!intertypefielddeclaration.getName().equals(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        boolean flag = intertypefielddeclaration.getTargetType().equals(ajtype);
        if (flag)
        {
            return intertypefielddeclaration;
        }
        continue; /* Loop/switch isn't completed */
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        i++;
          goto _L3
_L2:
        throw new NoSuchFieldException(s);
    }

    public InterTypeFieldDeclaration[] getDeclaredITDFields()
    {
        Object obj = new ArrayList();
        if (declaredITDFields == null)
        {
            Method amethod[] = clazz.getDeclaredMethods();
            int j = amethod.length;
            int i = 0;
            while (i < j) 
            {
                Method method = amethod[i];
                if (method.isAnnotationPresent(org/aspectj/internal/lang/annotation/ajcITD) && method.getName().contains("ajc$interFieldInit"))
                {
                    ajcITD ajcitd = (ajcITD)method.getAnnotation(org/aspectj/internal/lang/annotation/ajcITD);
                    Object obj1 = method.getName().replace("FieldInit", "FieldGetDispatch");
                    try
                    {
                        obj1 = clazz.getDeclaredMethod(((String) (obj1)), method.getParameterTypes());
                        ((List) (obj)).add(new InterTypeFieldDeclarationImpl(this, ajcitd.targetType(), ajcitd.modifiers(), ajcitd.name(), AjTypeSystem.getAjType(((Method) (obj1)).getReturnType()), ((Method) (obj1)).getGenericReturnType()));
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        throw new IllegalStateException((new StringBuilder()).append("Can't find field get dispatch method for ").append(method.getName()).toString());
                    }
                }
                i++;
            }
            addAnnotationStyleITDFields(((List) (obj)), false);
            declaredITDFields = new InterTypeFieldDeclaration[((List) (obj)).size()];
            ((List) (obj)).toArray(declaredITDFields);
        }
        return declaredITDFields;
    }

    public transient InterTypeMethodDeclaration getDeclaredITDMethod(String s, AjType ajtype, AjType aajtype[])
        throws NoSuchMethodException
    {
        InterTypeMethodDeclaration aintertypemethoddeclaration[];
        int i;
        int k;
        aintertypemethoddeclaration = getDeclaredITDMethods();
        k = aintertypemethoddeclaration.length;
        i = 0;
_L6:
        if (i >= k) goto _L2; else goto _L1
_L1:
        InterTypeMethodDeclaration intertypemethoddeclaration = aintertypemethoddeclaration[i];
        if (!intertypemethoddeclaration.getName().equals(s))
        {
            break MISSING_BLOCK_LABEL_129;
        }
        AjType aajtype1[];
        if (!intertypemethoddeclaration.getTargetType().equals(ajtype))
        {
            break MISSING_BLOCK_LABEL_129;
        }
        aajtype1 = intertypemethoddeclaration.getParameterTypes();
        if (aajtype1.length != aajtype.length)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        int j = 0;
_L4:
        boolean flag;
        if (j >= aajtype1.length)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = aajtype1[j].equals(aajtype[j]);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        j++;
        if (true) goto _L4; else goto _L3
_L2:
        throw new NoSuchMethodException(s);
_L3:
        return intertypemethoddeclaration;
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public InterTypeMethodDeclaration[] getDeclaredITDMethods()
    {
label0:
        {
            if (declaredITDMethods != null)
            {
                break label0;
            }
            ArrayList arraylist = new ArrayList();
            Method amethod[] = clazz.getDeclaredMethods();
            int j = amethod.length;
            int i = 0;
            do
            {
                if (i >= j)
                {
                    break;
                }
                Method method = amethod[i];
                if (method.getName().contains("ajc$interMethodDispatch1$") && method.isAnnotationPresent(org/aspectj/internal/lang/annotation/ajcITD))
                {
                    ajcITD ajcitd = (ajcITD)method.getAnnotation(org/aspectj/internal/lang/annotation/ajcITD);
                    arraylist.add(new InterTypeMethodDeclarationImpl(this, ajcitd.targetType(), ajcitd.modifiers(), ajcitd.name(), method));
                }
                i++;
            } while (true);
            addAnnotationStyleITDMethods(arraylist, false);
            declaredITDMethods = new InterTypeMethodDeclaration[arraylist.size()];
            arraylist.toArray(declaredITDMethods);
        }
        return declaredITDMethods;
    }

    public transient Method getDeclaredMethod(String s, AjType aajtype[])
        throws NoSuchMethodException
    {
        aajtype = clazz.getDeclaredMethod(s, toClassArray(aajtype));
        if (!isReallyAMethod(aajtype))
        {
            throw new NoSuchMethodException(s);
        } else
        {
            return aajtype;
        }
    }

    public Method[] getDeclaredMethods()
    {
        Method amethod[] = clazz.getDeclaredMethods();
        ArrayList arraylist = new ArrayList();
        int j = amethod.length;
        for (int i = 0; i < j; i++)
        {
            Method method = amethod[i];
            if (isReallyAMethod(method))
            {
                arraylist.add(method);
            }
        }

        amethod = new Method[arraylist.size()];
        arraylist.toArray(amethod);
        return amethod;
    }

    public org.aspectj.lang.reflect.Pointcut getDeclaredPointcut(String s)
        throws NoSuchPointcutException
    {
        org.aspectj.lang.reflect.Pointcut apointcut[] = getDeclaredPointcuts();
        int j = apointcut.length;
        for (int i = 0; i < j; i++)
        {
            org.aspectj.lang.reflect.Pointcut pointcut = apointcut[i];
            if (pointcut.getName().equals(s))
            {
                return pointcut;
            }
        }

        throw new NoSuchPointcutException(s);
    }

    public org.aspectj.lang.reflect.Pointcut[] getDeclaredPointcuts()
    {
        if (declaredPointcuts != null)
        {
            return declaredPointcuts;
        }
        ArrayList arraylist = new ArrayList();
        Object aobj[] = clazz.getDeclaredMethods();
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            org.aspectj.lang.reflect.Pointcut pointcut = asPointcut(aobj[i]);
            if (pointcut != null)
            {
                arraylist.add(pointcut);
            }
        }

        aobj = new org.aspectj.lang.reflect.Pointcut[arraylist.size()];
        arraylist.toArray(aobj);
        declaredPointcuts = ((org.aspectj.lang.reflect.Pointcut []) (aobj));
        return ((org.aspectj.lang.reflect.Pointcut []) (aobj));
    }

    public AjType getDeclaringType()
    {
        Class class1 = clazz.getDeclaringClass();
        if (class1 != null)
        {
            return new AjTypeImpl(class1);
        } else
        {
            return null;
        }
    }

    public Constructor getEnclosingConstructor()
    {
        return clazz.getEnclosingConstructor();
    }

    public Method getEnclosingMethod()
    {
        return clazz.getEnclosingMethod();
    }

    public AjType getEnclosingType()
    {
        Class class1 = clazz.getEnclosingClass();
        if (class1 != null)
        {
            return new AjTypeImpl(class1);
        } else
        {
            return null;
        }
    }

    public Object[] getEnumConstants()
    {
        return clazz.getEnumConstants();
    }

    public Field getField(String s)
        throws NoSuchFieldException
    {
        Field field = clazz.getField(s);
        if (field.getName().startsWith("ajc$"))
        {
            throw new NoSuchFieldException(s);
        } else
        {
            return field;
        }
    }

    public Field[] getFields()
    {
        Field afield[] = clazz.getFields();
        ArrayList arraylist = new ArrayList();
        int j = afield.length;
        for (int i = 0; i < j; i++)
        {
            Field field = afield[i];
            if (!field.getName().startsWith("ajc$") && !field.isAnnotationPresent(org/aspectj/lang/annotation/DeclareWarning) && !field.isAnnotationPresent(org/aspectj/lang/annotation/DeclareError))
            {
                arraylist.add(field);
            }
        }

        afield = new Field[arraylist.size()];
        arraylist.toArray(afield);
        return afield;
    }

    public Type getGenericSupertype()
    {
        return clazz.getGenericSuperclass();
    }

    public transient InterTypeConstructorDeclaration getITDConstructor(AjType ajtype, AjType aajtype[])
        throws NoSuchMethodException
    {
        InterTypeConstructorDeclaration aintertypeconstructordeclaration[];
        int i;
        int k;
        aintertypeconstructordeclaration = getITDConstructors();
        k = aintertypeconstructordeclaration.length;
        i = 0;
_L9:
        if (i >= k) goto _L2; else goto _L1
_L1:
        InterTypeConstructorDeclaration intertypeconstructordeclaration = aintertypeconstructordeclaration[i];
        if (!intertypeconstructordeclaration.getTargetType().equals(ajtype)) goto _L4; else goto _L3
_L3:
        AjType aajtype1[] = intertypeconstructordeclaration.getParameterTypes();
        if (aajtype1.length != aajtype.length) goto _L4; else goto _L5
_L5:
        int j = 0;
_L10:
        if (j >= aajtype1.length) goto _L7; else goto _L6
_L6:
        boolean flag = aajtype1[j].equals(aajtype[j]);
        if (flag) goto _L8; else goto _L4
_L4:
        i++;
          goto _L9
_L8:
        j++;
          goto _L10
_L2:
        throw new NoSuchMethodException();
_L7:
        return intertypeconstructordeclaration;
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
          goto _L4
    }

    public InterTypeConstructorDeclaration[] getITDConstructors()
    {
label0:
        {
            if (itdCons != null)
            {
                break label0;
            }
            ArrayList arraylist = new ArrayList();
            Method amethod[] = clazz.getMethods();
            int j = amethod.length;
            int i = 0;
            do
            {
                if (i >= j)
                {
                    break;
                }
                Method method = amethod[i];
                if (method.getName().contains("ajc$postInterConstructor") && method.isAnnotationPresent(org/aspectj/internal/lang/annotation/ajcITD))
                {
                    ajcITD ajcitd = (ajcITD)method.getAnnotation(org/aspectj/internal/lang/annotation/ajcITD);
                    if (Modifier.isPublic(ajcitd.modifiers()))
                    {
                        arraylist.add(new InterTypeConstructorDeclarationImpl(this, ajcitd.targetType(), ajcitd.modifiers(), method));
                    }
                }
                i++;
            } while (true);
            itdCons = new InterTypeConstructorDeclaration[arraylist.size()];
            arraylist.toArray(itdCons);
        }
        return itdCons;
    }

    public InterTypeFieldDeclaration getITDField(String s, AjType ajtype)
        throws NoSuchFieldException
    {
        InterTypeFieldDeclaration aintertypefielddeclaration[];
        int i;
        int j;
        aintertypefielddeclaration = getITDFields();
        j = aintertypefielddeclaration.length;
        i = 0;
_L3:
        if (i >= j) goto _L2; else goto _L1
_L1:
        InterTypeFieldDeclaration intertypefielddeclaration;
        intertypefielddeclaration = aintertypefielddeclaration[i];
        if (!intertypefielddeclaration.getName().equals(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        boolean flag = intertypefielddeclaration.getTargetType().equals(ajtype);
        if (flag)
        {
            return intertypefielddeclaration;
        }
        continue; /* Loop/switch isn't completed */
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        i++;
          goto _L3
_L2:
        throw new NoSuchFieldException(s);
    }

    public InterTypeFieldDeclaration[] getITDFields()
    {
label0:
        {
            Object obj = new ArrayList();
            if (itdFields != null)
            {
                break label0;
            }
            Method amethod[] = clazz.getMethods();
            int j = amethod.length;
            int i = 0;
label1:
            do
            {
                Method method;
                ajcITD ajcitd;
label2:
                {
                    if (i >= j)
                    {
                        break label1;
                    }
                    method = amethod[i];
                    if (!method.isAnnotationPresent(org/aspectj/internal/lang/annotation/ajcITD))
                    {
                        break label2;
                    }
                    ajcitd = (ajcITD)method.getAnnotation(org/aspectj/internal/lang/annotation/ajcITD);
                }
                if (method.getName().contains("ajc$interFieldInit") && Modifier.isPublic(ajcitd.modifiers()))
                {
                    Object obj1 = method.getName().replace("FieldInit", "FieldGetDispatch");
                    try
                    {
                        obj1 = method.getDeclaringClass().getDeclaredMethod(((String) (obj1)), method.getParameterTypes());
                        ((List) (obj)).add(new InterTypeFieldDeclarationImpl(this, ajcitd.targetType(), ajcitd.modifiers(), ajcitd.name(), AjTypeSystem.getAjType(((Method) (obj1)).getReturnType()), ((Method) (obj1)).getGenericReturnType()));
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        throw new IllegalStateException((new StringBuilder()).append("Can't find field get dispatch method for ").append(method.getName()).toString());
                    }
                }
                i++;
            } while (true);
            addAnnotationStyleITDFields(((List) (obj)), true);
            itdFields = new InterTypeFieldDeclaration[((List) (obj)).size()];
            ((List) (obj)).toArray(itdFields);
        }
        return itdFields;
    }

    public transient InterTypeMethodDeclaration getITDMethod(String s, AjType ajtype, AjType aajtype[])
        throws NoSuchMethodException
    {
        InterTypeMethodDeclaration aintertypemethoddeclaration[];
        int i;
        int k;
        aintertypemethoddeclaration = getITDMethods();
        k = aintertypemethoddeclaration.length;
        i = 0;
_L6:
        if (i >= k) goto _L2; else goto _L1
_L1:
        InterTypeMethodDeclaration intertypemethoddeclaration = aintertypemethoddeclaration[i];
        if (!intertypemethoddeclaration.getName().equals(s))
        {
            break MISSING_BLOCK_LABEL_129;
        }
        AjType aajtype1[];
        if (!intertypemethoddeclaration.getTargetType().equals(ajtype))
        {
            break MISSING_BLOCK_LABEL_129;
        }
        aajtype1 = intertypemethoddeclaration.getParameterTypes();
        if (aajtype1.length != aajtype.length)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        int j = 0;
_L4:
        boolean flag;
        if (j >= aajtype1.length)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = aajtype1[j].equals(aajtype[j]);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        j++;
        if (true) goto _L4; else goto _L3
_L2:
        throw new NoSuchMethodException(s);
_L3:
        return intertypemethoddeclaration;
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public InterTypeMethodDeclaration[] getITDMethods()
    {
label0:
        {
            if (itdMethods != null)
            {
                break label0;
            }
            ArrayList arraylist = new ArrayList();
            Method amethod[] = clazz.getDeclaredMethods();
            int j = amethod.length;
            int i = 0;
            do
            {
                if (i >= j)
                {
                    break;
                }
                Method method = amethod[i];
                if (method.getName().contains("ajc$interMethod$") && method.isAnnotationPresent(org/aspectj/internal/lang/annotation/ajcITD))
                {
                    ajcITD ajcitd = (ajcITD)method.getAnnotation(org/aspectj/internal/lang/annotation/ajcITD);
                    if (Modifier.isPublic(ajcitd.modifiers()))
                    {
                        arraylist.add(new InterTypeMethodDeclarationImpl(this, ajcitd.targetType(), ajcitd.modifiers(), ajcitd.name(), method));
                    }
                }
                i++;
            } while (true);
            addAnnotationStyleITDMethods(arraylist, true);
            itdMethods = new InterTypeMethodDeclaration[arraylist.size()];
            arraylist.toArray(itdMethods);
        }
        return itdMethods;
    }

    public AjType[] getInterfaces()
    {
        return toAjTypeArray(clazz.getInterfaces());
    }

    public Class getJavaClass()
    {
        return clazz;
    }

    public transient Method getMethod(String s, AjType aajtype[])
        throws NoSuchMethodException
    {
        aajtype = clazz.getMethod(s, toClassArray(aajtype));
        if (!isReallyAMethod(aajtype))
        {
            throw new NoSuchMethodException(s);
        } else
        {
            return aajtype;
        }
    }

    public Method[] getMethods()
    {
        Method amethod[] = clazz.getMethods();
        ArrayList arraylist = new ArrayList();
        int j = amethod.length;
        for (int i = 0; i < j; i++)
        {
            Method method = amethod[i];
            if (isReallyAMethod(method))
            {
                arraylist.add(method);
            }
        }

        amethod = new Method[arraylist.size()];
        arraylist.toArray(amethod);
        return amethod;
    }

    public int getModifiers()
    {
        return clazz.getModifiers();
    }

    public String getName()
    {
        return clazz.getName();
    }

    public Package getPackage()
    {
        return clazz.getPackage();
    }

    public PerClause getPerClause()
    {
        if (isAspect())
        {
            String s = ((Aspect)clazz.getAnnotation(org/aspectj/lang/annotation/Aspect)).value();
            if (s.equals(""))
            {
                if (getSupertype().isAspect())
                {
                    return getSupertype().getPerClause();
                } else
                {
                    return new PerClauseImpl(PerClauseKind.SINGLETON);
                }
            }
            if (s.startsWith("perthis("))
            {
                return new PointcutBasedPerClauseImpl(PerClauseKind.PERTHIS, s.substring("perthis(".length(), s.length() - 1));
            }
            if (s.startsWith("pertarget("))
            {
                return new PointcutBasedPerClauseImpl(PerClauseKind.PERTARGET, s.substring("pertarget(".length(), s.length() - 1));
            }
            if (s.startsWith("percflow("))
            {
                return new PointcutBasedPerClauseImpl(PerClauseKind.PERCFLOW, s.substring("percflow(".length(), s.length() - 1));
            }
            if (s.startsWith("percflowbelow("))
            {
                return new PointcutBasedPerClauseImpl(PerClauseKind.PERCFLOWBELOW, s.substring("percflowbelow(".length(), s.length() - 1));
            }
            if (s.startsWith("pertypewithin"))
            {
                return new TypePatternBasedPerClauseImpl(PerClauseKind.PERTYPEWITHIN, s.substring("pertypewithin(".length(), s.length() - 1));
            } else
            {
                throw new IllegalStateException((new StringBuilder()).append("Per-clause not recognized: ").append(s).toString());
            }
        } else
        {
            return null;
        }
    }

    public org.aspectj.lang.reflect.Pointcut getPointcut(String s)
        throws NoSuchPointcutException
    {
        org.aspectj.lang.reflect.Pointcut apointcut[] = getPointcuts();
        int j = apointcut.length;
        for (int i = 0; i < j; i++)
        {
            org.aspectj.lang.reflect.Pointcut pointcut = apointcut[i];
            if (pointcut.getName().equals(s))
            {
                return pointcut;
            }
        }

        throw new NoSuchPointcutException(s);
    }

    public org.aspectj.lang.reflect.Pointcut[] getPointcuts()
    {
        if (pointcuts != null)
        {
            return pointcuts;
        }
        ArrayList arraylist = new ArrayList();
        Object aobj[] = clazz.getMethods();
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            org.aspectj.lang.reflect.Pointcut pointcut = asPointcut(aobj[i]);
            if (pointcut != null)
            {
                arraylist.add(pointcut);
            }
        }

        aobj = new org.aspectj.lang.reflect.Pointcut[arraylist.size()];
        arraylist.toArray(aobj);
        pointcuts = ((org.aspectj.lang.reflect.Pointcut []) (aobj));
        return ((org.aspectj.lang.reflect.Pointcut []) (aobj));
    }

    public AjType getSupertype()
    {
        Class class1 = clazz.getSuperclass();
        if (class1 == null)
        {
            return null;
        } else
        {
            return new AjTypeImpl(class1);
        }
    }

    public TypeVariable[] getTypeParameters()
    {
        return clazz.getTypeParameters();
    }

    public int hashCode()
    {
        return clazz.hashCode();
    }

    public boolean isAnnotationPresent(Class class1)
    {
        return clazz.isAnnotationPresent(class1);
    }

    public boolean isArray()
    {
        return clazz.isArray();
    }

    public boolean isAspect()
    {
        return clazz.getAnnotation(org/aspectj/lang/annotation/Aspect) != null;
    }

    public boolean isEnum()
    {
        return clazz.isEnum();
    }

    public boolean isInstance(Object obj)
    {
        return clazz.isInstance(obj);
    }

    public boolean isInterface()
    {
        return clazz.isInterface();
    }

    public boolean isLocalClass()
    {
        return clazz.isLocalClass() && !isAspect();
    }

    public boolean isMemberAspect()
    {
        return clazz.isMemberClass() && isAspect();
    }

    public boolean isMemberClass()
    {
        return clazz.isMemberClass() && !isAspect();
    }

    public boolean isPrimitive()
    {
        return clazz.isPrimitive();
    }

    public boolean isPrivileged()
    {
        return isAspect() && clazz.isAnnotationPresent(org/aspectj/internal/lang/annotation/ajcPrivileged);
    }

    public String toString()
    {
        return getName();
    }
}
