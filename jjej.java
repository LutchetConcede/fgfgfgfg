URL url = new URL("https://vivado.requestcatcher.com");
HttpURLConnection con = (HttpURLConnection) url.openConnection();
con.setRequestMethod("GET");
OutputStream os = con.getOutputStream();
