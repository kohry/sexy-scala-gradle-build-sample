import org.gradle.api.{Plugin, Project}

class Main extends Plugin[Project]{

  override def apply(t: Project): Unit = println("hi")

}



