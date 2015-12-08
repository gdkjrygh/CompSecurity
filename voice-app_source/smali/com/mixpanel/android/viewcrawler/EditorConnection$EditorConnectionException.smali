.class public Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorConnectionException;
.super Ljava/io/IOException;
.source "EditorConnection.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/viewcrawler/EditorConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "EditorConnectionException"
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x1a28b2ed12bee2c4L


# instance fields
.field final synthetic this$0:Lcom/mixpanel/android/viewcrawler/EditorConnection;


# direct methods
.method public constructor <init>(Lcom/mixpanel/android/viewcrawler/EditorConnection;Ljava/lang/Throwable;)V
    .locals 1
    .param p2, "cause"    # Ljava/lang/Throwable;

    .prologue
    .line 32
    iput-object p1, p0, Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorConnectionException;->this$0:Lcom/mixpanel/android/viewcrawler/EditorConnection;

    .line 33
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 34
    return-void
.end method
