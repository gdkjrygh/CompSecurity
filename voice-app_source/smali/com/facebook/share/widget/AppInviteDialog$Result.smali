.class public final Lcom/facebook/share/widget/AppInviteDialog$Result;
.super Ljava/lang/Object;
.source "AppInviteDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/share/widget/AppInviteDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Result"
.end annotation


# instance fields
.field private final bundle:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 0
    .param p1, "bundle"    # Landroid/os/Bundle;

    .prologue
    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, Lcom/facebook/share/widget/AppInviteDialog$Result;->bundle:Landroid/os/Bundle;

    .line 57
    return-void
.end method


# virtual methods
.method public getData()Landroid/os/Bundle;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/facebook/share/widget/AppInviteDialog$Result;->bundle:Landroid/os/Bundle;

    return-object v0
.end method
