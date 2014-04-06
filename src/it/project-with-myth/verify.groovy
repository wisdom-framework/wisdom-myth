import java.io.*;

// Check the internal assets.
File style1 = new File( basedir, "target/classes/assets/int-style1.css" );
File style2 = new File( basedir, "target/classes/assets/sub/int-style2.css" );
if ( !style1.isFile() ) {
    throw new FileNotFoundException( "Could not find generated CSS: " + style1 );
}
if ( !style2.isFile() ) {
    throw new FileNotFoundException( "Could not find generated CSS: " + style2 );
}

// Check the external assets.
style1 = new File( basedir, "target/wisdom/assets/ext-style1.css" );
style2 = new File( basedir, "target/wisdom/assets/sub/ext-style2.css" );
if ( !style1.isFile() ) {
    throw new FileNotFoundException( "Could not find generated CSS: " + style1 );
}
if ( !style2.isFile() ) {
    throw new FileNotFoundException( "Could not find generated CSS: " + style2 );
}