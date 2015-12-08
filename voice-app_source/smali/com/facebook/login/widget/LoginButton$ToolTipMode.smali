.class public final enum Lcom/facebook/login/widget/LoginButton$ToolTipMode;
.super Ljava/lang/Enum;
.source "LoginButton.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/login/widget/LoginButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ToolTipMode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/login/widget/LoginButton$ToolTipMode;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum AUTOMATIC:Lcom/facebook/login/widget/LoginButton$ToolTipMode;

.field public static DEFAULT:Lcom/facebook/login/widget/LoginButton$ToolTipMode;

.field public static final enum DISPLAY_ALWAYS:Lcom/facebook/login/widget/LoginButton$ToolTipMode;

.field private static final synthetic ENUM$VALUES:[Lcom/facebook/login/widget/LoginButton$ToolTipMode;

.field public static final enum NEVER_DISPLAY:Lcom/facebook/login/widget/LoginButton$ToolTipMode;


# instance fields
.field private intValue:I

.field private stringValue:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 64
    new-instance v0, Lcom/facebook/login/widget/LoginButton$ToolTipMode;

    const-string v1, "AUTOMATIC"

    .line 68
    const-string v2, "automatic"

    invoke-direct {v0, v1, v3, v2, v3}, Lcom/facebook/login/widget/LoginButton$ToolTipMode;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lcom/facebook/login/widget/LoginButton$ToolTipMode;->AUTOMATIC:Lcom/facebook/login/widget/LoginButton$ToolTipMode;

    .line 70
    new-instance v0, Lcom/facebook/login/widget/LoginButton$ToolTipMode;

    const-string v1, "DISPLAY_ALWAYS"

    .line 73
    const-string v2, "display_always"

    invoke-direct {v0, v1, v4, v2, v4}, Lcom/facebook/login/widget/LoginButton$ToolTipMode;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lcom/facebook/login/widget/LoginButton$ToolTipMode;->DISPLAY_ALWAYS:Lcom/facebook/login/widget/LoginButton$ToolTipMode;

    .line 75
    new-instance v0, Lcom/facebook/login/widget/LoginButton$ToolTipMode;

    const-string v1, "NEVER_DISPLAY"

    .line 78
    const-string v2, "never_display"

    invoke-direct {v0, v1, v5, v2, v5}, Lcom/facebook/login/widget/LoginButton$ToolTipMode;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lcom/facebook/login/widget/LoginButton$ToolTipMode;->NEVER_DISPLAY:Lcom/facebook/login/widget/LoginButton$ToolTipMode;

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/login/widget/LoginButton$ToolTipMode;

    sget-object v1, Lcom/facebook/login/widget/LoginButton$ToolTipMode;->AUTOMATIC:Lcom/facebook/login/widget/LoginButton$ToolTipMode;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/login/widget/LoginButton$ToolTipMode;->DISPLAY_ALWAYS:Lcom/facebook/login/widget/LoginButton$ToolTipMode;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/login/widget/LoginButton$ToolTipMode;->NEVER_DISPLAY:Lcom/facebook/login/widget/LoginButton$ToolTipMode;

    aput-object v1, v0, v5

    sput-object v0, Lcom/facebook/login/widget/LoginButton$ToolTipMode;->ENUM$VALUES:[Lcom/facebook/login/widget/LoginButton$ToolTipMode;

    .line 80
    sget-object v0, Lcom/facebook/login/widget/LoginButton$ToolTipMode;->AUTOMATIC:Lcom/facebook/login/widget/LoginButton$ToolTipMode;

    sput-object v0, Lcom/facebook/login/widget/LoginButton$ToolTipMode;->DEFAULT:Lcom/facebook/login/widget/LoginButton$ToolTipMode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0
    .param p3, "stringValue"    # Ljava/lang/String;
    .param p4, "value"    # I

    .prologue
    .line 94
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 95
    iput-object p3, p0, Lcom/facebook/login/widget/LoginButton$ToolTipMode;->stringValue:Ljava/lang/String;

    .line 96
    iput p4, p0, Lcom/facebook/login/widget/LoginButton$ToolTipMode;->intValue:I

    .line 97
    return-void
.end method

.method public static fromInt(I)Lcom/facebook/login/widget/LoginButton$ToolTipMode;
    .locals 5
    .param p0, "enumValue"    # I

    .prologue
    .line 83
    invoke-static {}, Lcom/facebook/login/widget/LoginButton$ToolTipMode;->values()[Lcom/facebook/login/widget/LoginButton$ToolTipMode;

    move-result-object v2

    array-length v3, v2

    const/4 v1, 0x0

    :goto_0
    if-lt v1, v3, :cond_1

    .line 89
    const/4 v0, 0x0

    :cond_0
    return-object v0

    .line 83
    :cond_1
    aget-object v0, v2, v1

    .line 84
    .local v0, "mode":Lcom/facebook/login/widget/LoginButton$ToolTipMode;
    invoke-virtual {v0}, Lcom/facebook/login/widget/LoginButton$ToolTipMode;->getValue()I

    move-result v4

    if-eq v4, p0, :cond_0

    .line 83
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/login/widget/LoginButton$ToolTipMode;
    .locals 1

    .prologue
    .line 1
    const-class v0, Lcom/facebook/login/widget/LoginButton$ToolTipMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/login/widget/LoginButton$ToolTipMode;

    return-object v0
.end method

.method public static values()[Lcom/facebook/login/widget/LoginButton$ToolTipMode;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    sget-object v0, Lcom/facebook/login/widget/LoginButton$ToolTipMode;->ENUM$VALUES:[Lcom/facebook/login/widget/LoginButton$ToolTipMode;

    array-length v1, v0

    new-array v2, v1, [Lcom/facebook/login/widget/LoginButton$ToolTipMode;

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method


# virtual methods
.method public getValue()I
    .locals 1

    .prologue
    .line 105
    iget v0, p0, Lcom/facebook/login/widget/LoginButton$ToolTipMode;->intValue:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/facebook/login/widget/LoginButton$ToolTipMode;->stringValue:Ljava/lang/String;

    return-object v0
.end method
