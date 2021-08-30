package tomaszjh.rtl_foundation.handler;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.StandardCharsets;

public class WebHandler {

    @Nullable
    public static BufferedReader getURLContents(@Nonnull String stringURL, @Nonnull String backupFileLoc) {
        try {
            URL url = new URL(stringURL);
            URLConnection urlConnection = url.openConnection();
            InputStream stream = urlConnection.getInputStream();
            InputStreamReader streamReader = new InputStreamReader(stream);

            return new BufferedReader(streamReader);

        } catch (Exception exception) {
            exception.printStackTrace();
        }

        try {
            return new BufferedReader(new InputStreamReader(WebHandler.class.getClass().getClassLoader().getResourceAsStream(backupFileLoc), StandardCharsets.UTF_8));

        } catch (Exception exception) {
            exception.printStackTrace();
        }

        return null;
    }

    @Nullable
    public static BufferedReader getURLContents(@Nonnull String stringURL) {
        try {
            URL url = new URL(stringURL);
            URLConnection urlConnection = url.openConnection();
            InputStream stream = urlConnection.getInputStream();
            InputStreamReader streamReader = new InputStreamReader(stream);

            return new BufferedReader(streamReader);

        } catch (Exception exception) {
            exception.printStackTrace();
        }

        return null;
    }

    @Nullable
    public static int downloadURLContentstoFile(@Nonnull String stringURL, String fileLocation) {
        try {
            URL url = new URL(stringURL);
            HttpURLConnection huc = (HttpURLConnection) url.openConnection();
            huc.setRequestMethod("GET");
            huc.connect();
            int code = huc.getResponseCode();
            if (code == 404) {
                return -1;
            } else {
                ReadableByteChannel readableByteChannel = Channels.newChannel(url.openStream());
                FileOutputStream fileOutputStream = new FileOutputStream(fileLocation);
                fileOutputStream.getChannel().transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
                return 0;
            }

        } catch (Exception exception) {
            exception.printStackTrace();
            return -1;
        }

    }
}
