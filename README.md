# knime-node-extension-archetype

Maven archetype for KNIME Node Extension

# Create a project

    mvn archetype:generate \
        -DarchetypeGroupId=jp.uphy.knime.archetypes \
        -DarchetypeArtifactId=node-extension \
        -DarchetypeVersion=1.0.0 \
        -DgroupId=jp.uphy.knime.sample \
        -DartifactId=jp.uphy.knime.sample.sample1 \
        -Dversion=1.0.0 \
        -DnodeName=Foo \
        -DarchetypeRepository=http://uphy.github.io/knime-node-extension-archetype

Notes:

- "version" must be in a format x.y.z
  If you'd like to specify also "-SNAPSHOT", you must edit META-INF/MANIFEST.MF after the generation.
  Specify Build-Version as *.qualifier instead of *-SNAPSHOT
- "artifactId" should contains groupId
  "artifactId" will be used as symbolic name of OSGi Bundle.
- You can generate the settings for Eclipse by executing "mvn eclipse:eclipse".
  This command also append the Maven dependencies as Build Classpath of Eclipse Project.


For more details, see [this blog(in Japanese)](http://uphy.hatenablog.com/entry/knime-extension-maven)