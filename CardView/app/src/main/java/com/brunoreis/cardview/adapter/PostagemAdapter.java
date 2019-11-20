package com.brunoreis.cardview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.brunoreis.cardview.R;
import com.brunoreis.cardview.model.Postagem;

import java.util.List;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder> {

    private List<Postagem> postagens;

    public PostagemAdapter() {
    }

    public PostagemAdapter(List<Postagem> postagens) {
        this.postagens = postagens;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter,parent,false);


        return new MyViewHolder(itemLista) ;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Postagem postagem = this.postagens.get(position);
        holder.textNome.setText(postagem.getTextNome());
        holder.textPostagem.setText(postagem.getTextPostagem());
        holder.imageView.setImageResource(postagem.getImageView());
    }

    @Override
    public int getItemCount() {
        return postagens.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView textNome;
        private TextView textPostagem;
        private ImageView imageView;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textNome = itemView.findViewById(R.id.textNome);
            textPostagem = itemView.findViewById(R.id.textPostagem);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
