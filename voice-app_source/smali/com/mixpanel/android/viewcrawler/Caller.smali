.class Lcom/mixpanel/android/viewcrawler/Caller;
.super Ljava/lang/Object;
.source "Caller.java"


# static fields
.field private static final LOGTAG:Ljava/lang/String; = "MixpanelABTest.Caller"


# instance fields
.field private final mMethodArgs:[Ljava/lang/Object;

.field private final mMethodName:Ljava/lang/String;

.field private final mMethodResultType:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private final mTargetClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private final mTargetMethod:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Class;)V
    .locals 3
    .param p2, "methodName"    # Ljava/lang/String;
    .param p3, "methodArgs"    # [Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            "Ljava/lang/Class",
            "<*>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchMethodException;
        }
    .end annotation

    .prologue
    .line 10
    .local p1, "targetClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .local p4, "resultType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p2, p0, Lcom/mixpanel/android/viewcrawler/Caller;->mMethodName:Ljava/lang/String;

    .line 17
    iput-object p3, p0, Lcom/mixpanel/android/viewcrawler/Caller;->mMethodArgs:[Ljava/lang/Object;

    .line 18
    iput-object p4, p0, Lcom/mixpanel/android/viewcrawler/Caller;->mMethodResultType:Ljava/lang/Class;

    .line 19
    invoke-direct {p0, p1}, Lcom/mixpanel/android/viewcrawler/Caller;->pickMethod(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/mixpanel/android/viewcrawler/Caller;->mTargetMethod:Ljava/lang/reflect/Method;

    .line 20
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/Caller;->mTargetMethod:Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    .line 21
    new-instance v0, Ljava/lang/NoSuchMethodException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Method "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/mixpanel/android/viewcrawler/Caller;->mMethodName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " doesn\'t exit"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 24
    :cond_0
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/Caller;->mTargetMethod:Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    iput-object v0, p0, Lcom/mixpanel/android/viewcrawler/Caller;->mTargetClass:Ljava/lang/Class;

    .line 25
    return-void
.end method

.method private static assignableArgType(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 94
    .local p0, "type":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-class v0, Ljava/lang/Byte;

    if-ne p0, v0, :cond_1

    .line 95
    sget-object p0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 112
    :cond_0
    :goto_0
    return-object p0

    .line 96
    :cond_1
    const-class v0, Ljava/lang/Short;

    if-ne p0, v0, :cond_2

    .line 97
    sget-object p0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 98
    goto :goto_0

    :cond_2
    const-class v0, Ljava/lang/Integer;

    if-ne p0, v0, :cond_3

    .line 99
    sget-object p0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 100
    goto :goto_0

    :cond_3
    const-class v0, Ljava/lang/Long;

    if-ne p0, v0, :cond_4

    .line 101
    sget-object p0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 102
    goto :goto_0

    :cond_4
    const-class v0, Ljava/lang/Float;

    if-ne p0, v0, :cond_5

    .line 103
    sget-object p0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 104
    goto :goto_0

    :cond_5
    const-class v0, Ljava/lang/Double;

    if-ne p0, v0, :cond_6

    .line 105
    sget-object p0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 106
    goto :goto_0

    :cond_6
    const-class v0, Ljava/lang/Boolean;

    if-ne p0, v0, :cond_7

    .line 107
    sget-object p0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 108
    goto :goto_0

    :cond_7
    const-class v0, Ljava/lang/Character;

    if-ne p0, v0, :cond_0

    .line 109
    sget-object p0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    goto :goto_0
.end method

.method private pickMethod(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Ljava/lang/reflect/Method;"
        }
    .end annotation

    .prologue
    .line 116
    .local p1, "klass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    iget-object v10, p0, Lcom/mixpanel/android/viewcrawler/Caller;->mMethodArgs:[Ljava/lang/Object;

    array-length v10, v10

    new-array v1, v10, [Ljava/lang/Class;

    .line 117
    .local v1, "argumentTypes":[Ljava/lang/Class;
    const/4 v5, 0x0

    .local v5, "i":I
    :goto_0
    iget-object v10, p0, Lcom/mixpanel/android/viewcrawler/Caller;->mMethodArgs:[Ljava/lang/Object;

    array-length v10, v10

    if-lt v5, v10, :cond_1

    .line 121
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v11

    array-length v12, v11

    const/4 v10, 0x0

    :goto_1
    if-lt v10, v12, :cond_2

    .line 149
    const/4 v6, 0x0

    :cond_0
    return-object v6

    .line 118
    :cond_1
    iget-object v10, p0, Lcom/mixpanel/android/viewcrawler/Caller;->mMethodArgs:[Ljava/lang/Object;

    aget-object v10, v10, v5

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    aput-object v10, v1, v5

    .line 117
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 121
    :cond_2
    aget-object v6, v11, v10

    .line 122
    .local v6, "method":Ljava/lang/reflect/Method;
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    .line 123
    .local v4, "foundName":Ljava/lang/String;
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v8

    .line 125
    .local v8, "params":[Ljava/lang/Class;
    iget-object v13, p0, Lcom/mixpanel/android/viewcrawler/Caller;->mMethodName:Ljava/lang/String;

    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_3

    array-length v13, v8

    iget-object v14, p0, Lcom/mixpanel/android/viewcrawler/Caller;->mMethodArgs:[Ljava/lang/Object;

    array-length v14, v14

    if-eq v13, v14, :cond_4

    .line 121
    :cond_3
    :goto_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 129
    :cond_4
    iget-object v13, p0, Lcom/mixpanel/android/viewcrawler/Caller;->mMethodResultType:Ljava/lang/Class;

    invoke-static {v13}, Lcom/mixpanel/android/viewcrawler/Caller;->assignableArgType(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v2

    .line 130
    .local v2, "assignType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v13

    invoke-static {v13}, Lcom/mixpanel/android/viewcrawler/Caller;->assignableArgType(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v9

    .line 131
    .local v9, "resultType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {v2, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v13

    if-eqz v13, :cond_3

    .line 135
    const/4 v3, 0x1

    .line 136
    .local v3, "assignable":Z
    const/4 v5, 0x0

    :goto_3
    array-length v13, v8

    if-ge v5, v13, :cond_5

    if-nez v3, :cond_6

    .line 142
    :cond_5
    if-nez v3, :cond_0

    goto :goto_2

    .line 137
    :cond_6
    aget-object v13, v1, v5

    invoke-static {v13}, Lcom/mixpanel/android/viewcrawler/Caller;->assignableArgType(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    .line 138
    .local v0, "argumentType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    aget-object v13, v8, v5

    invoke-static {v13}, Lcom/mixpanel/android/viewcrawler/Caller;->assignableArgType(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v7

    .line 139
    .local v7, "paramType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {v7, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    .line 136
    add-int/lit8 v5, v5, 0x1

    goto :goto_3
.end method


# virtual methods
.method public applyMethod(Landroid/view/View;)Ljava/lang/Object;
    .locals 1
    .param p1, "target"    # Landroid/view/View;

    .prologue
    .line 37
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/Caller;->mMethodArgs:[Ljava/lang/Object;

    invoke-virtual {p0, p1, v0}, Lcom/mixpanel/android/viewcrawler/Caller;->applyMethodWithArguments(Landroid/view/View;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public applyMethodWithArguments(Landroid/view/View;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .param p1, "target"    # Landroid/view/View;
    .param p2, "arguments"    # [Ljava/lang/Object;

    .prologue
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 42
    .local v1, "klass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    iget-object v2, p0, Lcom/mixpanel/android/viewcrawler/Caller;->mTargetClass:Ljava/lang/Class;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 44
    :try_start_0
    iget-object v2, p0, Lcom/mixpanel/android/viewcrawler/Caller;->mTargetMethod:Ljava/lang/reflect/Method;

    invoke-virtual {v2, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v2

    .line 54
    :goto_0
    return-object v2

    .line 45
    :catch_0
    move-exception v0

    .line 46
    .local v0, "e":Ljava/lang/IllegalAccessException;
    const-string v2, "MixpanelABTest.Caller"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Method "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/mixpanel/android/viewcrawler/Caller;->mTargetMethod:Ljava/lang/reflect/Method;

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " appears not to be public"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 54
    .end local v0    # "e":Ljava/lang/IllegalAccessException;
    :cond_0
    :goto_1
    const/4 v2, 0x0

    goto :goto_0

    .line 47
    :catch_1
    move-exception v0

    .line 48
    .local v0, "e":Ljava/lang/IllegalArgumentException;
    const-string v2, "MixpanelABTest.Caller"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Method "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/mixpanel/android/viewcrawler/Caller;->mTargetMethod:Ljava/lang/reflect/Method;

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " called with arguments of the wrong type"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    .line 49
    .end local v0    # "e":Ljava/lang/IllegalArgumentException;
    :catch_2
    move-exception v0

    .line 50
    .local v0, "e":Ljava/lang/reflect/InvocationTargetException;
    const-string v2, "MixpanelABTest.Caller"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Method "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/mixpanel/android/viewcrawler/Caller;->mTargetMethod:Ljava/lang/reflect/Method;

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " threw an exception"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method

.method public argsAreApplicable([Ljava/lang/Object;)Z
    .locals 7
    .param p1, "proposedArgs"    # [Ljava/lang/Object;

    .prologue
    const/4 v4, 0x0

    .line 58
    iget-object v5, p0, Lcom/mixpanel/android/viewcrawler/Caller;->mTargetMethod:Ljava/lang/reflect/Method;

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v3

    .line 59
    .local v3, "paramTypes":[Ljava/lang/Class;
    array-length v5, p1

    array-length v6, v3

    if-eq v5, v6, :cond_1

    .line 84
    :cond_0
    :goto_0
    return v4

    .line 63
    :cond_1
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_1
    array-length v5, p1

    if-lt v1, v5, :cond_2

    .line 84
    const/4 v4, 0x1

    goto :goto_0

    .line 64
    :cond_2
    aget-object v5, v3, v1

    invoke-static {v5}, Lcom/mixpanel/android/viewcrawler/Caller;->assignableArgType(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v2

    .line 65
    .local v2, "paramType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    aget-object v5, p1, v1

    if-nez v5, :cond_4

    .line 66
    sget-object v5, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-eq v2, v5, :cond_0

    .line 67
    sget-object v5, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-eq v2, v5, :cond_0

    .line 68
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-eq v2, v5, :cond_0

    .line 69
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-eq v2, v5, :cond_0

    .line 70
    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-eq v2, v5, :cond_0

    .line 71
    sget-object v5, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-eq v2, v5, :cond_0

    .line 72
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-eq v2, v5, :cond_0

    .line 73
    sget-object v5, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-eq v2, v5, :cond_0

    .line 63
    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 77
    :cond_4
    aget-object v5, p1, v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-static {v5}, Lcom/mixpanel/android/viewcrawler/Caller;->assignableArgType(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    .line 78
    .local v0, "argumentType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {v2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_0
.end method

.method public getArgs()[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/Caller;->mMethodArgs:[Ljava/lang/Object;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[Caller "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/Caller;->mMethodName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/Caller;->mMethodArgs:[Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
