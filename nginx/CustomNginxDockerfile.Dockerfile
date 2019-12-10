FROM nginx
RUN chmod +w /etc/nginx/nginx.conf
COPY custom_nginx.conf /etc/nginx/nginx.conf
RUN cat /etc/nginx/nginx.conf
CMD ["nginx", "-g", "daemon off;"]