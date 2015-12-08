.class public final enum Lcom/facebook/share/internal/AppInviteDialogFeature;
.super Ljava/lang/Enum;
.source "AppInviteDialogFeature.java"

# interfaces
.implements Lcom/facebook/internal/DialogFeature;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/share/internal/AppInviteDialogFeature;",
        ">;",
        "Lcom/facebook/internal/DialogFeature;"
    }
.end annotation


# static fields
.field public static final enum APP_INVITES_DIALOG:Lcom/facebook/share/internal/AppInviteDialogFeature;

.field private static final synthetic ENUM$VALUES:[Lcom/facebook/share/internal/AppInviteDialogFeature;


# instance fields
.field private minVersion:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 33
    new-instance v0, Lcom/facebook/share/internal/AppInviteDialogFeature;

    const-string v1, "APP_INVITES_DIALOG"

    .line 34
    const v2, 0x133529d

    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/share/internal/AppInviteDialogFeature;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/share/internal/AppInviteDialogFeature;->APP_INVITES_DIALOG:Lcom/facebook/share/internal/AppInviteDialogFeature;

    .line 31
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/facebook/share/internal/AppInviteDialogFeature;

    sget-object v1, Lcom/facebook/share/internal/AppInviteDialogFeature;->APP_INVITES_DIALOG:Lcom/facebook/share/internal/AppInviteDialogFeature;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/share/internal/AppInviteDialogFeature;->ENUM$VALUES:[Lcom/facebook/share/internal/AppInviteDialogFeature;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .param p3, "minVersion"    # I

    .prologue
    .line 38
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 39
    iput p3, p0, Lcom/facebook/share/internal/AppInviteDialogFeature;->minVersion:I

    .line 40
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/share/internal/AppInviteDialogFeature;
    .locals 1

    .prologue
    .line 1
    const-class v0, Lcom/facebook/share/internal/AppInviteDialogFeature;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/share/internal/AppInviteDialogFeature;

    return-object v0
.end method

.method public static values()[Lcom/facebook/share/internal/AppInviteDialogFeature;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    sget-object v0, Lcom/facebook/share/internal/AppInviteDialogFeature;->ENUM$VALUES:[Lcom/facebook/share/internal/AppInviteDialogFeature;

    array-length v1, v0

    new-array v2, v1, [Lcom/facebook/share/internal/AppInviteDialogFeature;

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method


# virtual methods
.method public getAction()Ljava/lang/String;
    .locals 1

    .prologue
    .line 43
    const-string v0, "com.facebook.platform.action.request.APPINVITES_DIALOG"

    return-object v0
.end method

.method public getMinVersion()I
    .locals 1

    .prologue
    .line 47
    iget v0, p0, Lcom/facebook/share/internal/AppInviteDialogFeature;->minVersion:I

    return v0
.end method
