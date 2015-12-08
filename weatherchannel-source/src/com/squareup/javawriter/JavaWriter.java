// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.javawriter;

import java.io.Closeable;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.lang.model.element.Modifier;

// Referenced classes of package com.squareup.javawriter:
//            StringLiteral

public class JavaWriter
    implements Closeable
{
    private static final class Scope extends Enum
    {

        private static final Scope $VALUES[];
        public static final Scope ABSTRACT_METHOD;
        public static final Scope ANNOTATION_ARRAY_VALUE;
        public static final Scope ANNOTATION_ATTRIBUTE;
        public static final Scope CONSTRUCTOR;
        public static final Scope CONTROL_FLOW;
        public static final Scope INITIALIZER;
        public static final Scope INTERFACE_DECLARATION;
        public static final Scope NON_ABSTRACT_METHOD;
        public static final Scope TYPE_DECLARATION;

        public static Scope valueOf(String s)
        {
            return (Scope)Enum.valueOf(com/squareup/javawriter/JavaWriter$Scope, s);
        }

        public static Scope[] values()
        {
            return (Scope[])$VALUES.clone();
        }

        static 
        {
            TYPE_DECLARATION = new Scope("TYPE_DECLARATION", 0);
            INTERFACE_DECLARATION = new Scope("INTERFACE_DECLARATION", 1);
            ABSTRACT_METHOD = new Scope("ABSTRACT_METHOD", 2);
            NON_ABSTRACT_METHOD = new Scope("NON_ABSTRACT_METHOD", 3);
            CONSTRUCTOR = new Scope("CONSTRUCTOR", 4);
            CONTROL_FLOW = new Scope("CONTROL_FLOW", 5);
            ANNOTATION_ATTRIBUTE = new Scope("ANNOTATION_ATTRIBUTE", 6);
            ANNOTATION_ARRAY_VALUE = new Scope("ANNOTATION_ARRAY_VALUE", 7);
            INITIALIZER = new Scope("INITIALIZER", 8);
            $VALUES = (new Scope[] {
                TYPE_DECLARATION, INTERFACE_DECLARATION, ABSTRACT_METHOD, NON_ABSTRACT_METHOD, CONSTRUCTOR, CONTROL_FLOW, ANNOTATION_ATTRIBUTE, ANNOTATION_ARRAY_VALUE, INITIALIZER
            });
        }

        private Scope(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String INDENT = "  ";
    private static final int MAX_SINGLE_LINE_ATTRIBUTES = 3;
    private static final EnumSet METHOD_SCOPES;
    private static final Pattern TYPE_PATTERN = Pattern.compile("(?:[\\w$]+\\.)*([\\w\\.*$]+)");
    private static final Pattern TYPE_TRAILER = Pattern.compile("(.*?)(\\.\\.\\.|(?:\\[\\])+)$");
    private final Map importedTypes = new LinkedHashMap();
    private String indent;
    private boolean isCompressingTypes;
    private final Writer out;
    private String packagePrefix;
    private final Deque scopes = new ArrayDeque();
    private final Deque types = new ArrayDeque();

    public JavaWriter(Writer writer)
    {
        isCompressingTypes = true;
        indent = "  ";
        out = writer;
    }

    private void checkInMethod()
    {
        if (!METHOD_SCOPES.contains(scopes.peekFirst()))
        {
            throw new IllegalArgumentException();
        } else
        {
            return;
        }
    }

    private boolean containsArray(Collection collection)
    {
        for (collection = collection.iterator(); collection.hasNext();)
        {
            if (collection.next() instanceof Object[])
            {
                return true;
            }
        }

        return false;
    }

    private JavaWriter emitAnnotationValue(Object obj)
        throws IOException
    {
        if (obj instanceof Object[])
        {
            out.write("{");
            boolean flag = true;
            scopes.push(Scope.ANNOTATION_ARRAY_VALUE);
            obj = ((Object) ((Object[])(Object[])obj));
            int j = obj.length;
            int i = 0;
            while (i < j) 
            {
                Object obj1 = obj[i];
                if (flag)
                {
                    flag = false;
                    out.write("\n");
                } else
                {
                    out.write(",\n");
                }
                indent();
                out.write(obj1.toString());
                i++;
            }
            popScope(new Scope[] {
                Scope.ANNOTATION_ARRAY_VALUE
            });
            out.write("\n");
            indent();
            out.write("}");
            return this;
        } else
        {
            out.write(obj.toString());
            return this;
        }
    }

    private JavaWriter emitCompressedType(String s)
        throws IOException
    {
        if (isCompressingTypes)
        {
            out.write(compressType(s));
            return this;
        } else
        {
            out.write(s);
            return this;
        }
    }

    private JavaWriter emitLastEnumValue(String s)
        throws IOException
    {
        indent();
        out.write(s);
        out.write(";\n");
        return this;
    }

    private void emitModifiers(Set set)
        throws IOException
    {
        if (!set.isEmpty())
        {
            Object obj = set;
            if (!(set instanceof EnumSet))
            {
                obj = EnumSet.copyOf(set);
            }
            set = ((Set) (obj)).iterator();
            while (set.hasNext()) 
            {
                Modifier modifier = (Modifier)set.next();
                out.append(modifier.toString()).append(' ');
            }
        }
    }

    private void hangingIndent()
        throws IOException
    {
        int i = 0;
        for (int j = scopes.size(); i < j + 2; i++)
        {
            out.write(indent);
        }

    }

    private void indent()
        throws IOException
    {
        int i = 0;
        for (int j = scopes.size(); i < j; i++)
        {
            out.write(indent);
        }

    }

    private boolean isAmbiguous(String s)
    {
        return importedTypes.values().contains(s);
    }

    private static boolean isClassInPackage(String s, String s1)
    {
        while (s.startsWith(s1) && (s.indexOf('.', s1.length()) == -1 || Character.isUpperCase(s.charAt(s1.length())))) 
        {
            return true;
        }
        return false;
    }

    private transient void popScope(Scope ascope[])
    {
        if (!EnumSet.copyOf(Arrays.asList(ascope)).contains(scopes.pop()))
        {
            throw new IllegalStateException();
        } else
        {
            return;
        }
    }

    public static String rawType(String s)
    {
        int i = s.indexOf('<');
        String s1 = s;
        if (i != -1)
        {
            s1 = s.substring(0, i);
        }
        return s1;
    }

    public static String stringLiteral(String s)
    {
        return StringLiteral.forValue(s).literal();
    }

    public static transient String type(Class class1, String as[])
    {
        if (as.length == 0)
        {
            return class1.getCanonicalName();
        }
        if (class1.getTypeParameters().length != as.length)
        {
            throw new IllegalArgumentException();
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(class1.getCanonicalName());
        stringbuilder.append("<");
        stringbuilder.append(as[0]);
        for (int i = 1; i < as.length; i++)
        {
            stringbuilder.append(", ");
            stringbuilder.append(as[i]);
        }

        stringbuilder.append(">");
        return stringbuilder.toString();
    }

    public JavaWriter beginConstructor(Set set, List list, List list1)
        throws IOException
    {
        beginMethod(null, rawType((String)types.peekFirst()), set, list, list1);
        return this;
    }

    public transient JavaWriter beginConstructor(Set set, String as[])
        throws IOException
    {
        beginMethod(null, rawType((String)types.peekFirst()), set, as);
        return this;
    }

    public JavaWriter beginControlFlow(String s)
        throws IOException
    {
        return beginControlFlow(s, new Object[0]);
    }

    public transient JavaWriter beginControlFlow(String s, Object aobj[])
        throws IOException
    {
        checkInMethod();
        indent();
        out.write(String.format(s, aobj));
        out.write(" {\n");
        scopes.push(Scope.CONTROL_FLOW);
        return this;
    }

    public JavaWriter beginInitializer(boolean flag)
        throws IOException
    {
        indent();
        if (flag)
        {
            out.write("static");
            out.write(" {\n");
        } else
        {
            out.write("{\n");
        }
        scopes.push(Scope.INITIALIZER);
        return this;
    }

    public JavaWriter beginMethod(String s, String s1, Set set, List list, List list1)
        throws IOException
    {
        indent();
        emitModifiers(set);
        if (s != null)
        {
            emitCompressedType(s);
            out.write(" ");
            out.write(s1);
        } else
        {
            emitCompressedType(s1);
        }
        out.write("(");
        if (list != null)
        {
            int k;
            for (int i = 0; i < list.size(); emitCompressedType((String)list.get(k)))
            {
                if (i != 0)
                {
                    out.write(", ");
                }
                k = i + 1;
                emitCompressedType((String)list.get(i));
                out.write(" ");
                i = k + 1;
            }

        }
        out.write(")");
        if (list1 != null && list1.size() > 0)
        {
            out.write("\n");
            indent();
            out.write("    throws ");
            for (int j = 0; j < list1.size(); j++)
            {
                if (j != 0)
                {
                    out.write(", ");
                }
                emitCompressedType((String)list1.get(j));
            }

        }
        if (set.contains(Modifier.ABSTRACT) || Scope.INTERFACE_DECLARATION.equals(scopes.peek()))
        {
            out.write(";\n");
            scopes.push(Scope.ABSTRACT_METHOD);
            return this;
        }
        out.write(" {\n");
        s1 = scopes;
        if (s == null)
        {
            s = Scope.CONSTRUCTOR;
        } else
        {
            s = Scope.NON_ABSTRACT_METHOD;
        }
        s1.push(s);
        return this;
    }

    public transient JavaWriter beginMethod(String s, String s1, Set set, String as[])
        throws IOException
    {
        return beginMethod(s, s1, set, Arrays.asList(as), null);
    }

    public JavaWriter beginType(String s, String s1)
        throws IOException
    {
        return beginType(s, s1, ((Set) (EnumSet.noneOf(javax/lang/model/element/Modifier))), null, new String[0]);
    }

    public JavaWriter beginType(String s, String s1, Set set)
        throws IOException
    {
        return beginType(s, s1, set, null, new String[0]);
    }

    public transient JavaWriter beginType(String s, String s1, Set set, String s2, String as[])
        throws IOException
    {
        indent();
        emitModifiers(set);
        out.write(s1);
        out.write(" ");
        emitCompressedType(s);
        if (s2 != null)
        {
            out.write(" extends ");
            emitCompressedType(s2);
        }
        if (as.length > 0)
        {
            out.write("\n");
            indent();
            out.write("    implements ");
            for (int i = 0; i < as.length; i++)
            {
                if (i != 0)
                {
                    out.write(", ");
                }
                emitCompressedType(as[i]);
            }

        }
        out.write(" {\n");
        set = scopes;
        if ("interface".equals(s1))
        {
            s1 = Scope.INTERFACE_DECLARATION;
        } else
        {
            s1 = Scope.TYPE_DECLARATION;
        }
        set.push(s1);
        types.push(s);
        return this;
    }

    public void close()
        throws IOException
    {
        out.close();
    }

    public String compressType(String s)
    {
        Matcher matcher;
        StringBuilder stringbuilder;
        Matcher matcher1;
        int i;
        matcher = TYPE_TRAILER.matcher(s);
        if (matcher.matches())
        {
            s = matcher.group(1);
        }
        stringbuilder = new StringBuilder();
        if (packagePrefix == null)
        {
            throw new IllegalStateException();
        }
        matcher1 = TYPE_PATTERN.matcher(s);
        i = 0;
_L2:
        String s1;
        boolean flag = matcher1.find(i);
        int j;
        if (flag)
        {
            j = matcher1.start();
        } else
        {
            j = s.length();
        }
        stringbuilder.append(s, i, j);
        if (!flag)
        {
            if (matcher.matches())
            {
                stringbuilder.append(matcher.group(2));
            }
            return stringbuilder.toString();
        }
        s1 = matcher1.group(0);
        String s2 = (String)importedTypes.get(s1);
        if (s2 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuilder.append(s2);
_L3:
        i = matcher1.end();
        if (true) goto _L2; else goto _L1
_L1:
        if (isClassInPackage(s1, packagePrefix))
        {
            String s3 = s1.substring(packagePrefix.length());
            if (isAmbiguous(s3))
            {
                stringbuilder.append(s1);
            } else
            {
                stringbuilder.append(s3);
            }
        } else
        if (isClassInPackage(s1, "java.lang."))
        {
            stringbuilder.append(s1.substring("java.lang.".length()));
        } else
        {
            stringbuilder.append(s1);
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public JavaWriter emitAnnotation(Class class1)
        throws IOException
    {
        return emitAnnotation(type(class1, new String[0]), Collections.emptyMap());
    }

    public JavaWriter emitAnnotation(Class class1, Object obj)
        throws IOException
    {
        return emitAnnotation(type(class1, new String[0]), obj);
    }

    public JavaWriter emitAnnotation(Class class1, Map map)
        throws IOException
    {
        return emitAnnotation(type(class1, new String[0]), map);
    }

    public JavaWriter emitAnnotation(String s)
        throws IOException
    {
        return emitAnnotation(s, Collections.emptyMap());
    }

    public JavaWriter emitAnnotation(String s, Object obj)
        throws IOException
    {
        indent();
        out.write("@");
        emitCompressedType(s);
        out.write("(");
        emitAnnotationValue(obj);
        out.write(")");
        out.write("\n");
        return this;
    }

    public JavaWriter emitAnnotation(String s, Map map)
        throws IOException
    {
        indent();
        out.write("@");
        emitCompressedType(s);
        map.size();
        JVM INSTR tableswitch 0 1: default 48
    //                   0 292
    //                   1 200;
           goto _L1 _L2 _L3
_L2:
        break MISSING_BLOCK_LABEL_292;
_L1:
        boolean flag;
        if (map.size() > 3 || containsArray(map.values()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        out.write("(");
        scopes.push(Scope.ANNOTATION_ATTRIBUTE);
        if (flag)
        {
            s = "\n";
        } else
        {
            s = "";
        }
        map = map.entrySet().iterator();
        while (map.hasNext()) 
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            out.write(s);
            if (flag)
            {
                s = ",\n";
            } else
            {
                s = ", ";
            }
            if (flag)
            {
                indent();
            }
            out.write((String)entry.getKey());
            out.write(" = ");
            emitAnnotationValue(entry.getValue());
        }
        break; /* Loop/switch isn't completed */
_L3:
        s = (java.util.Map.Entry)map.entrySet().iterator().next();
        out.write("(");
        if (!"value".equals(s.getKey()))
        {
            out.write((String)s.getKey());
            out.write(" = ");
        }
        emitAnnotationValue(s.getValue());
        out.write(")");
_L5:
        out.write("\n");
        return this;
        popScope(new Scope[] {
            Scope.ANNOTATION_ATTRIBUTE
        });
        if (flag)
        {
            out.write("\n");
            indent();
        }
        out.write(")");
        if (true) goto _L5; else goto _L4
_L4:
    }

    public JavaWriter emitEmptyLine()
        throws IOException
    {
        out.write("\n");
        return this;
    }

    public JavaWriter emitEnumValue(String s)
        throws IOException
    {
        indent();
        out.write(s);
        out.write(",\n");
        return this;
    }

    public JavaWriter emitEnumValue(String s, boolean flag)
        throws IOException
    {
        if (flag)
        {
            return emitLastEnumValue(s);
        } else
        {
            return emitEnumValue(s);
        }
    }

    public JavaWriter emitEnumValues(Iterable iterable)
        throws IOException
    {
        for (iterable = iterable.iterator(); iterable.hasNext();)
        {
            String s = (String)iterable.next();
            if (iterable.hasNext())
            {
                emitEnumValue(s);
            } else
            {
                emitLastEnumValue(s);
            }
        }

        return this;
    }

    public JavaWriter emitField(String s, String s1)
        throws IOException
    {
        return emitField(s, s1, ((Set) (EnumSet.noneOf(javax/lang/model/element/Modifier))), null);
    }

    public JavaWriter emitField(String s, String s1, Set set)
        throws IOException
    {
        return emitField(s, s1, set, null);
    }

    public JavaWriter emitField(String s, String s1, Set set, String s2)
        throws IOException
    {
        indent();
        emitModifiers(set);
        emitCompressedType(s);
        out.write(" ");
        out.write(s1);
        if (s2 != null)
        {
            out.write(" =");
            if (!s2.startsWith("\n"))
            {
                out.write(" ");
            }
            s = s2.split("\n", -1);
            out.write(s[0]);
            for (int i = 1; i < s.length; i++)
            {
                out.write("\n");
                hangingIndent();
                out.write(s[i]);
            }

        }
        out.write(";\n");
        return this;
    }

    public JavaWriter emitImports(Collection collection)
        throws IOException
    {
        for (collection = (new TreeSet(collection)).iterator(); collection.hasNext(); out.write(";\n"))
        {
            String s = (String)collection.next();
            Matcher matcher = TYPE_PATTERN.matcher(s);
            if (!matcher.matches())
            {
                throw new IllegalArgumentException(s);
            }
            if (importedTypes.put(s, matcher.group(1)) != null)
            {
                throw new IllegalArgumentException(s);
            }
            out.write("import ");
            out.write(s);
        }

        return this;
    }

    public transient JavaWriter emitImports(Class aclass[])
        throws IOException
    {
        ArrayList arraylist = new ArrayList(aclass.length);
        int j = aclass.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(aclass[i].getCanonicalName());
        }

        return emitImports(((Collection) (arraylist)));
    }

    public transient JavaWriter emitImports(String as[])
        throws IOException
    {
        return emitImports(((Collection) (Arrays.asList(as))));
    }

    public transient JavaWriter emitJavadoc(String s, Object aobj[])
        throws IOException
    {
        s = String.format(s, aobj);
        indent();
        out.write("/**\n");
        s = s.split("\n");
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            aobj = s[i];
            indent();
            out.write(" *");
            if (!((String) (aobj)).isEmpty())
            {
                out.write(" ");
                out.write(((String) (aobj)));
            }
            out.write("\n");
        }

        indent();
        out.write(" */\n");
        return this;
    }

    public JavaWriter emitPackage(String s)
        throws IOException
    {
        if (packagePrefix != null)
        {
            throw new IllegalStateException();
        }
        if (s.isEmpty())
        {
            packagePrefix = "";
            return this;
        } else
        {
            out.write("package ");
            out.write(s);
            out.write(";\n\n");
            packagePrefix = (new StringBuilder()).append(s).append(".").toString();
            return this;
        }
    }

    public transient JavaWriter emitSingleLineComment(String s, Object aobj[])
        throws IOException
    {
        indent();
        out.write("// ");
        out.write(String.format(s, aobj));
        out.write("\n");
        return this;
    }

    public transient JavaWriter emitStatement(String s, Object aobj[])
        throws IOException
    {
        checkInMethod();
        s = String.format(s, aobj).split("\n", -1);
        indent();
        out.write(s[0]);
        for (int i = 1; i < s.length; i++)
        {
            out.write("\n");
            hangingIndent();
            out.write(s[i]);
        }

        out.write(";\n");
        return this;
    }

    public JavaWriter emitStaticImports(Collection collection)
        throws IOException
    {
        for (collection = (new TreeSet(collection)).iterator(); collection.hasNext(); out.write(";\n"))
        {
            String s = (String)collection.next();
            Matcher matcher = TYPE_PATTERN.matcher(s);
            if (!matcher.matches())
            {
                throw new IllegalArgumentException(s);
            }
            if (importedTypes.put(s, matcher.group(1)) != null)
            {
                throw new IllegalArgumentException(s);
            }
            out.write("import static ");
            out.write(s);
        }

        return this;
    }

    public transient JavaWriter emitStaticImports(String as[])
        throws IOException
    {
        return emitStaticImports(((Collection) (Arrays.asList(as))));
    }

    public JavaWriter endConstructor()
        throws IOException
    {
        popScope(new Scope[] {
            Scope.CONSTRUCTOR
        });
        indent();
        out.write("}\n");
        return this;
    }

    public JavaWriter endControlFlow()
        throws IOException
    {
        return endControlFlow(null);
    }

    public JavaWriter endControlFlow(String s)
        throws IOException
    {
        return endControlFlow(s, new Object[0]);
    }

    public transient JavaWriter endControlFlow(String s, Object aobj[])
        throws IOException
    {
        popScope(new Scope[] {
            Scope.CONTROL_FLOW
        });
        indent();
        if (s != null)
        {
            out.write("} ");
            out.write(String.format(s, aobj));
            out.write(";\n");
            return this;
        } else
        {
            out.write("}\n");
            return this;
        }
    }

    public JavaWriter endInitializer()
        throws IOException
    {
        popScope(new Scope[] {
            Scope.INITIALIZER
        });
        indent();
        out.write("}\n");
        return this;
    }

    public JavaWriter endMethod()
        throws IOException
    {
        Scope scope = (Scope)scopes.pop();
        if (scope == Scope.NON_ABSTRACT_METHOD || scope == Scope.CONSTRUCTOR)
        {
            indent();
            out.write("}\n");
        } else
        if (scope != Scope.ABSTRACT_METHOD)
        {
            throw new IllegalStateException();
        }
        return this;
    }

    public JavaWriter endType()
        throws IOException
    {
        popScope(new Scope[] {
            Scope.TYPE_DECLARATION, Scope.INTERFACE_DECLARATION
        });
        types.pop();
        indent();
        out.write("}\n");
        return this;
    }

    public String getIndent()
    {
        return indent;
    }

    public boolean isCompressingTypes()
    {
        return isCompressingTypes;
    }

    public JavaWriter nextControlFlow(String s)
        throws IOException
    {
        return nextControlFlow(s, new Object[0]);
    }

    public transient JavaWriter nextControlFlow(String s, Object aobj[])
        throws IOException
    {
        popScope(new Scope[] {
            Scope.CONTROL_FLOW
        });
        indent();
        scopes.push(Scope.CONTROL_FLOW);
        out.write("} ");
        out.write(String.format(s, aobj));
        out.write(" {\n");
        return this;
    }

    public void setCompressingTypes(boolean flag)
    {
        isCompressingTypes = flag;
    }

    public void setIndent(String s)
    {
        indent = s;
    }

    static 
    {
        METHOD_SCOPES = EnumSet.of(Scope.NON_ABSTRACT_METHOD, Scope.CONSTRUCTOR, Scope.CONTROL_FLOW, Scope.INITIALIZER);
    }
}
